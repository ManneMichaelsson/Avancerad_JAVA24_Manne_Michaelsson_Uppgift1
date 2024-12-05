package Vehicle.DifferentVehicles;

import Vehicle.Vehicle;

public class Motorcycle extends Vehicle {
    boolean aiMotorcycle;

    public Motorcycle(String vehicleName, String plateNumber, int rentalPrice, boolean aiMotorcycle) {
        super(vehicleName, plateNumber, rentalPrice);
        this.aiMotorcycle = aiMotorcycle;
    }

    @Override
    public void sound() {
        System.out.println("Wrooooooom");
    }
}
