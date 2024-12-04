package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class Car extends Vehicle {

    public Car(String vehicleName, String plateNumber, int rentalPrice) {
        super(vehicleName, plateNumber, rentalPrice);
    }

    @Override
    public void sound() {
        System.out.println("wroom");
    }
}