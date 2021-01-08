
public class BicycleDemo3 {
    public static void main(String[] args)  {
        Bicycle3 bike_1 = new Bicycle3();
        bike_1.printState();  // Ausgabe: |Cadence: 0 |Speed:   0.0 |Gear:    1
        /* Bei der Initialisierung der Klassenattribute werden nun nur gültige Werte zugelassen. Folglich zeigt der Gang nun 1 und nicht mehr 0. */ 

        // Alle anderen Ausgaben bleiben unverändert:
        Bicycle3 bike_2 = new Bicycle3(0, 0.0, 1);
        bike_2.printState();  // Ausgabe: |Cadence: 0 |Speed:   0.0 |Gear:    1

        bike_1.changeGear(2);
        bike_1.changeCadence(10);
        bike_1.speedUp(11.5);

        bike_1.printState();  // Ausgabe: |Cadence: 10 |Speed:   11.5 |Gear:    2
        bike_2.printState();  // Ausgabe: |Cadence: 0 |Speed:   0.0 |Gear:    1

        bike_2.syncBikes(bike_1);
        bike_1.printState();  // Ausgabe: |Cadence: 10 |Speed:   11.5 |Gear:    2
        bike_2.printState();  // Ausgabe: |Cadence: 10 |Speed:   11.5 |Gear:    1
    }
}


class Bicycle3 {
    /* -- Attribute */
    private int     cadence = 0;    // Trittfrequenz
    private double  speed   = 0.0;  // Geschwindigkeit
    private int     gear    = 1;    // Gang

    /* -- Konstruktoren */
    public Bicycle3() {
    }

    public Bicycle3(int cadence, double speed, int gear) {
        if (cadence < 0) {cadence = 0;}
        if (gear < 1) {gear = 1;} else if (gear > 9) {gear = 9;}
        this.cadence = cadence;
        this.speed   = speed;
        this.gear    = gear;
    }

    /* -- Methoden */
    public void changeCadence(int newValue) {
        if (newValue < 0) {newValue = 0;}
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        if (newValue < 1) {newValue = 1;} else if (newValue > 9) {newValue = 9;}
        gear = newValue;
    }

    public void speedUp(double incrementValue) {
        speed = speed + incrementValue;
    }

    public void slowDown(double decrementValue) {
        speed = speed - decrementValue;
    }

    public void syncBikes(Bicycle3 bikeTwo) {
        this.changeCadence(bikeTwo.cadence);
        this.changeGear(bikeTwo.gear);
        this.speed   = bikeTwo.speed;
    }

    public void printState() {
        System.out.println(" |Cadence: " + cadence + 
                           " |Speed:   " + speed +
                           " |Gear:    " + gear);
    }
}
