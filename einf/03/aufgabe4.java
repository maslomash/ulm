public class aufgabe4 {
    public static void main(String[] args){
        String prefix, suffix;
        for (int i = 2; i <= 100; i++) {
            if (i % 5 == 0) {
                prefix = "look! ";
            } else {
                prefix = "";
            }
            if (i % 3 == 0) {
                suffix = " grumpy";
            } else {
                suffix = "";
            }
            System.out.println(prefix + i + suffix + " cats");
        }
    }
}
