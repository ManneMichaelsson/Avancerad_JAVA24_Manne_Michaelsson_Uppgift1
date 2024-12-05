package Userinterface;

import Rentable.Rentable;
import Rentable.RentalVehicle;
import Vehicle.DifferentVehicles.Car;
import Vehicle.DifferentVehicles.Motorcycle;
import Vehicle.DifferentVehicles.SUV;
import Vehicle.DifferentVehicles.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    public static void main(String[] args) {
        boolean renting = false;
        int vehicleNumber = 10;
        double totalPrice = 0;
        int daysRented = 0;
        Scanner scanner = new Scanner(System.in);

        ArrayList<RentalVehicle> vehicles = new ArrayList<>();
        vehicles.add(new RentalVehicle(new Car("Tesla", "ABC 123", 200, 4)));
        vehicles.add(new RentalVehicle(new SUV("Polestar", "PLK 541", 300, true)));
        vehicles.add(new RentalVehicle(new Truck("Volvo Truck", "IGT 538", 500, "Redbull")));
        vehicles.add(new RentalVehicle(new Motorcycle("Kawasaki", "OLT 293", 100, true)));

        mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
    }

    public static void mainMenu(ArrayList<RentalVehicle> vehicles, boolean renting, int vehicleNumber, Scanner scanner, double totalPrice, int daysRented) {
        String choice;
        if (renting) {
            menuIfRented(daysRented, totalPrice);
        } else if (!renting) {
            menuIfNotRented(daysRented, totalPrice);
        }
        choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("1")) { //Hyra bil
            if (!renting) {
                rentVehicle(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
            }
            else if (renting) {
                System.out.println("You are already renting a vehicle, please return the " + vehicles.get(vehicleNumber).getVehicle().getVehicleName() + " to rent a new vehicle");
                mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
            }
        }
        else if (choice.equalsIgnoreCase("2")) { //Lämna tillbaka bil
            if (renting) {
                returnVehicle(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
            }
            else if (!renting) {
                System.out.println("You are currently not renting, please rent a vehicle first. Press enter to continue");
                scanner.nextLine();
                mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
            }
        }
        else if (choice.equalsIgnoreCase("3")) { //Information om bilarna
            RentalVehicle.informationRental();
            System.out.print("Press enter to continue");
            scanner.nextLine();
            mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
        }
        else if (choice.equalsIgnoreCase("4")) { //åk på en dagsutflykt
            if (!renting) {
                System.out.println("you need to rent a vehicle first! Press enter to continue");
                scanner.nextLine();
                mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
            }
            else if (renting) {
                totalPrice += oneDayTrip(vehicles, vehicleNumber, scanner);
                daysRented++;
                mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
            }
        }
        else if (choice.equalsIgnoreCase("5")) { //avsluta
            if (renting) {
                System.out.println("You need to return your rental! Press enter to continue");
                scanner.nextLine();
                mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
            } else if (!renting) {
                scanner.close();
                System.out.println("Goodbye! Thanks for having us!");
            }
        }
        else {
            System.out.println("Invalid choice, please try again. Press enter to continue");
            scanner.nextLine();
            System.out.println();
            mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
        }
    }

    public static void rentVehicle(ArrayList<RentalVehicle> vehicles, boolean renting, int vehicleNumber, Scanner scanner, double totalPrice, int daysRented) {
        String choice;

        System.out.println("--- Which vehicle do you want to rent? ---");
        for (int i = 0; i < vehicles.toArray().length; i++) {
            System.out.println((i + 1) + ". " + vehicles.get(i).getVehicle().getVehicleName() + ", platenumber: " + vehicles.get(i).getVehicle().getPlateNumber() + ", price " + vehicles.get(i).getVehicle().getRentalPrice() + "kr /day");
        }
        System.out.println("5. Back");
        System.out.print("enter your choice: ");

        choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("1")) {
            vehicles.get(0).rent();
            renting = true;
            vehicleNumber = 0;
            mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
        }
        else if (choice.equalsIgnoreCase("2")) {
            vehicles.get(1).rent();
            renting = true;
            vehicleNumber = 1;
            mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
        }
        else if (choice.equalsIgnoreCase("3")) {
            vehicles.get(2).rent();
            renting = true;
            vehicleNumber = 2;
            mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
        }
        else if (choice.equalsIgnoreCase("4")) {
            vehicles.get(3).rent();
            renting = true;
            vehicleNumber = 3;
            mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
        }
        else if (choice.equalsIgnoreCase("5")) {
            mainMenu(vehicles, renting, vehicleNumber,scanner, totalPrice, daysRented);
        } else {
            System.out.println("Invalid choice, please try again");
            rentVehicle(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
        }
    }

    private static void returnVehicle(ArrayList<RentalVehicle> vehicles, boolean renting, int vehicleNumber, Scanner scanner, double totalPrice, int daysRented) {
        vehicles.get(vehicleNumber).returnVehicle();
        renting = false;
        vehicleNumber = 10;
        System.out.println("Press enter to continue");
        scanner.nextLine();
        mainMenu(vehicles, renting, vehicleNumber, scanner, totalPrice, daysRented);
    }
    private static double oneDayTrip(ArrayList<RentalVehicle> vehicles, int vehicleNumber, Scanner scanner) {
        System.out.println("Going on a trip! Press enter to continue");
        vehicles.get(vehicleNumber).getVehicle().sound();
        scanner.nextLine();
        return vehicles.get(vehicleNumber).calculateRentalPrice(1);
    }
    public static void menuIfRented(int daysRented, double totalPrice){
        System.out.println("__________________________________");
        System.out.println("--- How can i help you today? ---");
        System.out.println("1. Rent a Vehicle [ALREADY RENTING]");
        System.out.println("2. Return a Vehicle");
        System.out.println("3. Information about a rental");
        System.out.println("4. Go on a trip (1 day)");
        System.out.println("5. Exit");
        System.out.println("__________________________________");
        System.out.println("Total days rented: " + daysRented);
        System.out.println("Total spent: " + totalPrice + "kr");
        System.out.print("enter your choice: ");
    }
    public static void menuIfNotRented(int daysRented, double totalPrice){
        System.out.println("__________________________________");
        System.out.println("--- How can i help you today? ---");
        System.out.println("1. Rent a Vehicle");
        System.out.println("2. Return a Vehicle [NOT RENTING ANYTHING]");
        System.out.println("3. Information about a rental");
        System.out.println("4. Go on a trip [NEED TO RENT FIRST]");
        System.out.println("5. Exit");
        System.out.println("__________________________________");
        System.out.println("Total days rented: " + daysRented);
        System.out.println("Total spent: " + totalPrice + "kr");
        System.out.print("enter your choice: ");
    }
}
