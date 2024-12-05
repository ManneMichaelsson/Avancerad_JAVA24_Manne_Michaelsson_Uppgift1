package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class Car extends Vehicle {
    private int wheels;

    public Car(String vehicleName, String plateNumber, int rentalPrice, int wheels) {
        super(vehicleName, plateNumber, rentalPrice);
        this.wheels = wheels;
    }

    @Override
    public void sound() {
        System.out.println("wroom");
    }
}
