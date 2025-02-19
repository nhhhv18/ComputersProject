package entities;

public class DeviceFactory {
    public Device createDevice(DeviceType type, String name, String brand, int yearOfProduction, int size, boolean backlit, String keyboardType) {
        if (type == null) {
            return null;
        }
        
        switch (type) {
            case PRINTER:
                return new Printer(name, brand, yearOfProduction);
            case MONITOR:
                return new Monitor(name, brand, yearOfProduction, size);
            case KEYBOARD:
                return new Keyboard(name, brand, yearOfProduction, backlit, keyboardType);
            default:
                return null;
        }
    }
}
