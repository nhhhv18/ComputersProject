//Hello Github!

package entities;

//import exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;


import static entities.OperatingSystem.OperatingSystemType.*;
import static entities.Storage.StorageType.*;



public class ComputerMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         final Logger logger = LogManager.getLogger(ComputerMain.class);

         Computer computer = new Computer("ComputerSolvd");
         computer.handlePower(true);
         
         System.out.println();
         
         DeviceFactory deviceFactory = new DeviceFactory();
 
         Device printer = deviceFactory.createDevice(DeviceType.PRINTER, "HP LaserJet", "HP", 2020, 0, false, null);
         printer.displayDeviceDetails();
         
         Device monitor = deviceFactory.createDevice(DeviceType.MONITOR, "Dell Ultrasharp", "Dell", 2022, 27, false, null);
         monitor.displayDeviceDetails();
         
         Device keyboard = deviceFactory.createDevice(DeviceType.KEYBOARD, "Logitech G915", "Logitech", 2021, 0, true, "Mechanical");
         keyboard.displayDeviceDetails();
         
         System.out.println();
         computer.handlePower(false);
         
         
         
         
         
         
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
     
    }
}
