package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleName, String plateNumber, int rentalPrice) {
        super(vehicleName, plateNumber, rentalPrice);
    }

    @Override
    public void sound() {
        System.out.println("Wrooooooom");
    }
}
