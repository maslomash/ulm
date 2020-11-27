import java.util.ArrayList;

public class zusatzaufgabe {
    public static void main(String[] args){
        // Zahl n von der Konsole einlesen
        Long n = Long.parseLong(args[0]);

        // Beliebig erweiterbare ArrayList verwenden um alle Faktoren zu sammeln
        ArrayList<Long> factors = new ArrayList<Long>(0);

        // Alle Teiler von 2 bis maximal sqrt(n) durchprobieren
        long t = 2;
        while (t * t < n) {
            // Wenn t ein Teiler ist, diesen zur Liste hinzufügen. Gleichzeitig n durch t teilen
            if (n % t == 0) {
                factors.add(t);
                n /= t;
            // Wenn kein Teiler, nächsthöhere Zahl probieren
            } else {
                t++;
            }
        }
        // Das finale n ist eine Primzahl und wird auch zu den Faktoren ergänzt
        factors.add(n);

        // Ausgabe erstellen durch Ergänzung aller Primfaktoren zum Outputstring
        String output = "Primfaktorzerlegung von " + n + " = ";
        for (Long factor : factors) {
            output += factor + "*";
        }
        output = output.substring(0, output.length()-1);

        // Finale Ausgabe
        System.out.println(output);
    }
}
