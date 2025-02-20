package entities;

import interfaces.DeviceIdentifiable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import exceptions.*;

public class PrinterDecorator extends Printer {
    protected Printer printer; // The original printer instance

    public PrinterDecorator(Printer printer) {
        super(printer.name, printer.brand, printer.yearOfProduction, printer.file);
        this.printer = printer;
    }

    @Override
    public void handleConnection(Boolean state) {
        printer.handleConnection(state); // Delegating to the original printer
    }

    @Override
    public void printFile() throws PrinterOutOfPaperException, NotReadableFileException {
        printer.printFile(); // Delegating to the original printer
    }

    @Override
    public void connect() throws InvalidConnectionException {
        printer.connect(); // Delegating to the original printer
    }

    @Override
    public void displayDeviceDetails() {
        printer.displayDeviceDetails(); // Delegating to the original printer
    }

    @Override
    public String getDeviceName() {
        return printer.getDeviceName();
    }

    @Override
    public String getDeviceBrand() {
        return printer.getDeviceBrand();
    }

    @Override
    public void close() {
        printer.close(); // Delegating to the original printer
    }
}
