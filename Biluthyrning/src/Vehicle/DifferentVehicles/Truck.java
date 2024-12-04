package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class Truck extends Vehicle {
    public Truck(String vehicleName, String plateNumber, int rentalPrice) {
        super(vehicleName, plateNumber, rentalPrice);
    }

    @Override
    public void sound() {
        System.out.println("Tuggatuggatugga");
    }
}
