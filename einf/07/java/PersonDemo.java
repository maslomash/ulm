
import java.util.Scanner;

class Person {
    String name = "";
    int alter = 0;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void ausgabe() {
        System.out.println(name + " ist " + alter + " alt.");
    }

}

class Student extends Person {
    int matrikel = 0;

    public Student(String name, int alter, int matrikel) {
        super(name, alter);
        this.matrikel = matrikel;
    }

    public void ausgabe() {
        System.out.println(name + " ist " + alter + " alt und hat Matrikelnummer " + matrikel + ".");
    }
}


class Mitarbeiter extends Person {
    String abteilung = "";

    public Mitarbeiter(String name, int alter, String abteilung) {
        super(name, alter);
        this.abteilung = abteilung;
    }

    public void ausgabe() {
        System.out.println(name + " ist " + alter + " alt und arbeitet in Abteilung " + abteilung + ".");
    }
}


public class PersonDemo {
    static int MAX_PERSONS = 100;
    public static void main(String[] args) {
        Person[] p_arr = new Person[MAX_PERSONS];
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Personen eingeben:");
        System.out.println("Studenten:   NAME;ALTER;MATRIKELNUMMER(int)");
        System.out.println("Mitarbeiter: NAME;ALTER;ABTEILUNG(string)");
        System.out.println("-------------------------------------------");

        for (i = 0; i < MAX_PERSONS; i++) {
            String[] input = scanner.nextLine().split(";");
            if (input.length < 3) {
                i--;
                break;
            }
            try {
                int matrikel = Integer.parseInt(input[2]);
                p_arr[i] = new Student(input[0], Integer.parseInt(input[1]), matrikel);
            } catch (NumberFormatException e) {
                p_arr[i] = new Mitarbeiter(input[0], Integer.parseInt(input[1]), input[2]);
            }
        }
        scanner.close();

        for (int j = 0; j <= i; j++) {
            p_arr[j].ausgabe();
        }
    }
}