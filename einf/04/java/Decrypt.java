
import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String line;
        char c;

        for (int rot = 0; rot <= 125-32; rot++) {
            line = Integer.toString(rot) + ": ";
            for (int pos = 0; pos < input.length(); pos++) {
                c = (char) ((((int) input.charAt(pos)) - 32 + rot) % (125 - 32 + 1) + 32);
                line += c;
            }
            System.out.println(line);
        }
    }
}
