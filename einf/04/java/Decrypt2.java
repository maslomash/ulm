
import java.util.Scanner;

public class Decrypt2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verschlüsselten Satz eingeben:");
        String input = scanner.nextLine();
        System.out.println("Buchstabe:");
        char letter = scanner.nextLine().charAt(0);
        System.out.println("Minimale relative Häufigkeit in %:");
        double ratio = Double.parseDouble(scanner.nextLine()) / 100.0;
        scanner.close();

        String line;
        char c;
        int input_length = input.length();
        int letter_count;

        for (int rot = 0; rot <= 125-32; rot++) {
            line = "";
            letter_count = 0;
            for (int pos = 0; pos < input_length; pos++) {
                c = (char) ((((int) input.charAt(pos)) - 32 + rot) % (125 - 32 + 1) + 32);
                line += c;
                if (c == letter) letter_count++;
            }
            if (((double) letter_count / (double) input_length) > ratio)
                System.out.println(Integer.toString(rot) + ": " + line);
        }
    }
}
