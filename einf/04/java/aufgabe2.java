
import java.lang.Math;

class Zufallsmuster {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        
        int zeros = 0;
        double probability = 1.0;
        double random;
        String line = "";

        while (true) {
            random = Math.random();
            if (zeros < n) {
                if (random > probability) {
                    line += "1";
                    System.out.println(line);
                    line = "";
                    probability = 1.0;
                } else {
                    line += "0 ";
                    probability /= 2;
                    zeros++;
                }
            } else {
                System.out.println(line);
                break;
            }
        }
    }
}