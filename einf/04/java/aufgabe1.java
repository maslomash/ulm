
import java.util.Scanner;

class SchwobifierLight {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        String new_sentence = new String();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 's' && sentence.charAt(i+1) == 't') {
                new_sentence += "scht";
                i++;
            } else {
                new_sentence += sentence.charAt(i); 
            }
        }
        new_sentence += ", woischt.";
        System.out.println(new_sentence);
    }
}