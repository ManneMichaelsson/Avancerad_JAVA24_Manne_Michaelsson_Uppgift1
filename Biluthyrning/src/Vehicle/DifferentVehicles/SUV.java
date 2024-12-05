package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class SUV extends Vehicle {
    private boolean bluetooth;

    public SUV(String vehicleName, String plateNumber, int rentalPrice, boolean bluetooth) {
        super(vehicleName, plateNumber, rentalPrice);
        this.bluetooth = bluetooth;
    }

    @Override
    public void sound() {
        System.out.println("Grrr wrom WROM");
    }
}
