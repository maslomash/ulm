
public class BicycleDemo2 {
    public static void main(String[] args)  {
        Bicycle2 bike_1 = new Bicycle2();
        bike_1.printState();  // Ausgabe: |Cadence: 0 |Speed:   0.0 |Gear:    0
        /* 
        Erklärung: 
        Klassenattribute werden stets mit 0 (bzw. 0.0, false oder Null) initialisiert.
        */

        Bicycle2 bike_2 = new Bicycle2(0, 0.0, 1);
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


class Bicycle2 {
    /* -- Attribute */
    private int     cadence;    // Trittfrequenz
    private double  speed;      // Geschwindigkeit
    private int     gear;       // Gang

    /* -- Konstruktoren */
    public Bicycle2() {
    }

    public Bicycle2(int cadence, double speed, int gear) {
        this.cadence = cadence;
        this.speed   = speed;
        this.gear    = gear;
    }

    /* -- Methoden */
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(double incrementValue) {
        speed = speed + incrementValue;
    }

    public void slowDown(double decrementValue) {
        speed = speed - decrementValue;
    }

    public void syncBikes(Bicycle2 bikeTwo) {
        this.cadence = bikeTwo.cadence;
        this.speed   = bikeTwo.speed;
        this.gear    = bikeTwo.gear;
    }

    public void printState() {
        System.out.println(" |Cadence: " + cadence + 
                           " |Speed:   " + speed +
                           " |Gear:    " + gear);
    }
}
