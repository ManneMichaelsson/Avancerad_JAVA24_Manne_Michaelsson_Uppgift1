package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class SUV extends Vehicle {
    public SUV(String vehicleName, String plateNumber, int rentalPrice) {
        super(vehicleName, plateNumber, rentalPrice);
    }

    @Override
    public void sound() {
        System.out.println("Grrr wrom WROM");
    }
}
