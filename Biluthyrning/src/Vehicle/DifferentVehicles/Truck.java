package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class Truck extends Vehicle {
    private String advertisment;

    public Truck(String vehicleName, String plateNumber, int rentalPrice, String advertisment) {
        super(vehicleName, plateNumber, rentalPrice);
        this.advertisment = advertisment;
    }

    @Override
    public void sound() {
        System.out.println("Tuggatuggatugga");
    }
}
