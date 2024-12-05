# Inlämningsuppgift 1 
Ett program där man kan hyra virtuella fordon. Syftet med programmet är att hyra en bil och köra med bilen på en utflykt. Du kan också returnera bilen. När du använt bilen så behöver man betala. Programmet körs via konsollen. 

## Funktioner
- Välj att hyra en bil
- Returnera en bil
- Få information om uthyrningen
- Åk en dagsutflykt
- Lämna applikationen

## Installation
1. Klona projektet
2. git clone https://github.com/ManneMichaelsson/Inl-mningsuppgift1.git
3. Öppna upp filen
4. Öppna "Biluthyrning"
5. Öppna "src"
6. Öppna "Userinterface"
7. Starta "userinterface"

### Användning
Starta programmet och följ informationen som är i terminalen. Använd siffror 1-5 för att välja från menyn som visas i terminalen. Några delar av programmet vill att man klickar på "ENTER" för att fortsätta. Du kan endast hyra 1 fordon åt gången, för att hyra ett nytt fordon behöver du lämna tillbaka den nuvarande fordornet du hyr. Priserna varierar beorde på vilken dag du använder programmet.
        - måndag = priset * 1
        - tisdag = priset * 2
        - onsdag = priset * 2
        - torsdag = priset * 2
        - fredag = priset * 3
        - lördag = priset * 4
        - söndag = priset * 2

### Exempel från programmet
$ Userinterface
__________________________________
--- How can i help you today? ---
1. Rent a Vehicle
2. Return a Vehicle [NOT RENTING ANYTHING]
3. Information about a rental
4. Go on a trip [NEED TO RENT FIRST]
5. Exit
__________________________________
Total days rented: 0
Total spent: 0.0kr
enter your choice: 
