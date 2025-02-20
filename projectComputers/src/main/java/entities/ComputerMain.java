//Hello Github!

package entities;

//import exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import interfaces.ObserverMonitor;
import lombok.Builder;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import exceptions.*;


import static entities.OperatingSystem.OperatingSystemType.*;
import static entities.Storage.StorageType.*;


public class ComputerMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         final Logger logger = LogManager.getLogger(ComputerMain.class);

         System.out.println();
         Computer computer1 = new Computer("ComputerSolvd");
         computer1.handlePower(true);

         
         Printer printer = new Printer("HP Printer", "HP", 2022, "Document1.txt");

         // Wrap the printer with a security decorator and simulate an authenticated user
         Printer securityPrinter = new SecurityPrinterDecorator(printer, true);  // User is authenticated

         securityPrinter.handleConnection(true);
         try {
             securityPrinter.printFile(); // Will succeed as the user is authenticated
         } catch (PrinterOutOfPaperException | NotReadableFileException | SecurityException e) {
             logger.error("Error: " + e.getMessage());
         }

         /* Now simulate a non-authenticated user
         Printer nonAuthenticatedSecurityPrinter = new SecurityPrinterDecorator(printer, false);  // User is NOT authenticated

         try {
             nonAuthenticatedSecurityPrinter.printFile(); // Will fail as the user is not authenticated
         } catch (PrinterOutOfPaperException | NotReadableFileException | SecurityException e) {
             logger.error("Error: " + e.getMessage());
         }
         */

         System.out.println();
         // Turning off the printer connection (for authenticated user only)
         securityPrinter.close(); // This will work
        // nonAuthenticatedSecurityPrinter.close(); 
         
         
         
         
         
         
         
         
         System.out.println();
         // Turning off the computer after operation
         computer1.handlePower(false);
    }
   }
     

         
         
         /*
        Device monitor = new Monitor("Samsung Solvd2024", "Samsung", 2022, 27);
        Device keyboard = new Keyboard("Keyboard Mechanical 123", "Logitech", 2021, true, "Mechanical");
        Device printer = new Printer("LaserJet 123", "HP", 2020, "Solvd Documentation");
        Storage storage = new Storage(SSDS, 512, 200);
        OperatingSystem os = new OperatingSystem(WINDOWS, "11");

        List<Device> devices = new ArrayList<>();
        devices.add(monitor);
        devices.add(keyboard);
        devices.add(printer);

        List<Storage> storageDevices = new ArrayList<>();
        storageDevices.add(storage);

        List<String> powerSources = new ArrayList<>();
        powerSources.add("AC Adapter");
        powerSources.add("Battery");

        List<String> installedApplications = new ArrayList<>();
        installedApplications.add("Google Chrome");
        installedApplications.add("Visual Studio Code");
        installedApplications.add("Microsoft Word");


        Set<String> userAccounts = new HashSet<>();
        userAccounts.add("admin");
        userAccounts.add("user1");
        userAccounts.add("guest");
        userAccounts.add("user2");
        userAccounts.add("user3");
        userAccounts.add("user4");

        Map<String, Integer> userLoginCounts = new HashMap<>();
        userLoginCounts.put("admin", 5);
        userLoginCounts.put("user1", 3);
        userLoginCounts.put("guest", 1);

        Computer computer = new Computer("MyComputer", os, devices, storageDevices, powerSources, installedApplications, userAccounts, userLoginCounts);
        computer.handlePower(true);
        computer.displayComputerDetails();
        
        System.out.println();
        computer.handlePower(false);
        */
     

