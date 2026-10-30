
package asma.amigal;


public class AsmaAmigal {

    
    public static void main(String[] args) {
      

        ElectricalDevice[] devices = {
            new Fan(),
            new Television(),
            new Refrigerator(),
            new WashingMachine(),
            new AirConditioner()
        };

        for (ElectricalDevice device : devices) {

            System.out.println("====================");

            device.turnOn();

            device.displayInfo();

            System.out.println(
                "Energy Consumption: "
                + device.calculateEnergy(5)
                + " kWh"
            );

            device.turnOff();
        }
    }
}


interface ElectricalDevice {

    void turnOn();
    void turnOff();
    void displayInfo();
    double calculateEnergy(int hours);
}


class Fan implements ElectricalDevice {

    String name = "Fan";
    String brand = "Samsung";
    double power = 75;
    boolean isOn = false;
    int speed = 3;

    public void turnOn() {
        isOn = true;
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Fan is OFF");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
        System.out.println("Speed: " + speed);
    }

    public double calculateEnergy(int hours) {
        return power * hours / 1000;
    }
}


class Television implements ElectricalDevice {

    String name = "Television";
    String brand = "LG";
    double power = 120;
    boolean isOn = false;
    int screenSize = 55;

    public void turnOn() {
        isOn = true;
        System.out.println("TV is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is OFF");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
        System.out.println("Screen Size: " + screenSize);
    }

    public double calculateEnergy(int hours) {
        return power * hours / 1000;
    }
}


class Refrigerator implements ElectricalDevice {

    String name = "Refrigerator";
    String brand = "Beko";
    double power = 250;
    boolean isOn = false;
    int temperature = 4;

    public void turnOn() {
        isOn = true;
        System.out.println("Refrigerator is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Refrigerator is OFF");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
        System.out.println("Temperature: " + temperature);
    }

    public double calculateEnergy(int hours) {
        return power * hours / 1000;
    }
}


class WashingMachine implements ElectricalDevice {

    String name = "Washing Machine";
    String brand = "Bosch";
    double power = 800;
    boolean isOn = false;
    int capacity = 8;

    public void turnOn() {
        isOn = true;
        System.out.println("Washing Machine is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Washing Machine is OFF");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
        System.out.println("Capacity: " + capacity + " KG");
    }

    public double calculateEnergy(int hours) {
        return power * hours / 1000;
    }
}


class AirConditioner implements ElectricalDevice {

    String name = "Air Conditioner";
    String brand = "Gree";
    double power = 1500;
    boolean isOn = false;
    int temperature = 24;

    public void turnOn() {
        isOn = true;
        System.out.println("Air Conditioner is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air Conditioner is OFF");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
        System.out.println("Temperature: " + temperature);
    }

    public double calculateEnergy(int hours) {
        return power * hours / 1000;
    }
}


   

    

