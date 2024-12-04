package Vehicle;

import java.time.DayOfWeek;
import java.time.LocalDate;

abstract public class Vehicle {
    private final String vehicleName;
    private final String plateNumber;
    private int rentalPrice;

    public Vehicle(String vehicleName, String plateNumber, int rentalPrice) {
        this.vehicleName = vehicleName;
        this.plateNumber = plateNumber;
        this.rentalPrice = rentalPrice * getPriceMultiplierThisDay();
    }

    /*Tar emot dagens datum, olika mulipliers beroende på vilken dag det är.
        Måndag = *1
        tisdag = *2
        onsdag = *2
        torsdag = *2
        fredag = *3
        lördag = *4
        söndag = *2
    */
    public int getPriceMultiplierThisDay(){
        LocalDate today = LocalDate.now(); //Får dagens datum
        if (today.getDayOfWeek() == DayOfWeek.MONDAY) {
            return 1;
        } else if (today.getDayOfWeek() == DayOfWeek.TUESDAY) {
            return 2;
        } else if (today.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            return 2;
        }
        else if (today.getDayOfWeek() == DayOfWeek.THURSDAY) {
            return 2;
        }
        else if (today.getDayOfWeek() == DayOfWeek.FRIDAY) {
            return 3;
        }
        else if (today.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return 4;
        }
        else if (today.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return 2;
        }
        return 0;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }
    public abstract void sound();
}
