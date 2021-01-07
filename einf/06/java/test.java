public class test {
            
    // Erstelle globale Variablen a, b, c
    static String a = "Blumen";
    static int b = 20;
    static boolean c = false;

    // Erhaelt Werte von a, b, c in lokalen Variablen x, y, c
    static int m (String x, int y, boolean c) {  
        // Setze lokales x auf "Ich habe 20 Blumen"
        x = "Ich habe " + y + " " + x; 
        // Setze lokales c auf true
        c = true;
        // Setze lokales y auf 30
        y = b + 10;
        return b;  // Rueckgabe des globalen Werts 20
    }

    // Erhaelt Wert 20
    static void n(int i) {
        if (c)  // c = false 
            i = i + i;  
        else
            // Setze lokales i auf 18
            i = i - 2;
    }

    public static void main(String[] args) {
        // Uebergebe Werte der globalen Variablen a, b, c an m()
        // Uebergebe Rueckgabewert von m() an n()
        n(m(a, b, c));

        System.out.println(a);  // Ausgabe: Blumen
        System.out.println(b);  // Ausgabe: 20
        System.out.println(c);  // Ausgabe: false
    }
}