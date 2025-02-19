package entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
// Abstract Class
public abstract class Device {
    protected String name;
    protected String brand;
    protected int yearOfProduction;

    
    public Device(String name, String brand, int yearOfProduction) {
        this.name = name;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }
    

    public abstract void displayDeviceDetails();

}


