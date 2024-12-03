package Vehicle;

import java.time.DayOfWeek;
import java.time.LocalDate;

abstract public class Vehicle {
    String fordonNamn;
    String regnr;
    int hyrPrisPerDag;
    private LocalDate forstaDagenIVeckan;
    private LocalDate sistaDagenIVeckan;

    public Vehicle(String fordonNamn, String regnr, int hyrPrisPerDag) {
        this.fordonNamn = fordonNamn;
        this.regnr = regnr;
        this.hyrPrisPerDag = hyrPrisPerDag;
    }

    /*Tar emot dagens datum, olika mulipliers beroende på vilken dag det är.
        måndag = *1
        tisdag = *2
        onsdag = *2
        torsdag = *2
        fredag = *3
        lördag = *4
        söndag = *2
    */
    public static int getPriceMultiplierThisDay(){
        LocalDate idag = LocalDate.now(); //Får fram dagens datum
        if (idag.getDayOfWeek() == DayOfWeek.MONDAY) {
            return 1;
        } else if (idag.getDayOfWeek() == DayOfWeek.TUESDAY) {
            return 2;
        } else if (idag.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            return 2;
        }
        else if (idag.getDayOfWeek() == DayOfWeek.THURSDAY) {
            return 2;
        }
        else if (idag.getDayOfWeek() == DayOfWeek.FRIDAY) {
            return 3;
        }
        else if (idag.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return 4;
        }
        else if (idag.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return 2;
        }
        return 0;
    }
}
