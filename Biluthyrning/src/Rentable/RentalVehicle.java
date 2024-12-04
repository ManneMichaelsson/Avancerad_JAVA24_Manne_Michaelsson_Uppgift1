package Rentable;

import Vehicle.Vehicle;

public class RentalVehicle implements Rentable {
    private Vehicle vehicle;

    public RentalVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void rent() {
        System.out.println("You are renting this " + vehicle.getVehicleName());
    }

    @Override
    public void returnVehicle() {
        System.out.println("You are returning this " + vehicle.getVehicleName() + ". Hope it went well!");
    }

    @Override
    public double calculateRentalPrice(int daysRented) {
        double totalAmount;
        totalAmount = daysRented * (vehicle.getPriceMultiplierThisDay() * vehicle.getRentalPrice());
        return totalAmount;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public static void informationRental(){
        System.out.println("--- Multipliers for each day due to higher demand ---");
        System.out.println("Mondays: x1 kr");
        System.out.println("Tuesdays: x2 kr");
        System.out.println("Wednesdays: x2 kr");
        System.out.println("Thursdays: x2 kr");
        System.out.println("Fridays: x3 kr");
        System.out.println("Saturdays: x4 kr");
        System.out.println("Sundays: x2 kr");
        System.out.println("________________________");
    }
}
