package entities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import exceptions.*;

public class SecurityPrinterDecorator extends PrinterDecorator {
    private static final Logger logger = LogManager.getLogger(SecurityPrinterDecorator.class);

    private boolean isAuthenticated;

    public SecurityPrinterDecorator(Printer printer, boolean isAuthenticated) {
        super(printer);
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public void printFile() throws PrinterOutOfPaperException, NotReadableFileException {
        if (isAuthenticated) {
            logger.info("User authenticated. Proceeding with print...");
            super.printFile(); // Delegate the printing process to the original printer
        } else {
            logger.error("User not authenticated. Cannot print file.");
            throw new SecurityException("User not authenticated. Printing denied.");
        }
    }

    @Override
    public void handleConnection(Boolean state) {
        if (isAuthenticated) {
            super.handleConnection(state); // Delegate connection handling if authenticated
        } else {
            logger.error("User not authenticated. Cannot change connection state.");
        }
    }

    @Override
    public void close() {
        if (isAuthenticated) {
            super.close(); // Allow closing the printer connection only if authenticated
        } else {
            logger.error("User not authenticated. Cannot disconnect.");
        }
    }
}
