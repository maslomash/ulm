
import java.util.Scanner;

public class aufgabe1 {
    public static void main (String[] args) {
        // --- EINGABEN ---
        Integer[] arr = {1, 2, 3};  // Einlesen von Konsole war nicht gefordert
        Integer s = 3;  // Länge der Teilmengen

        Integer l = arr.length;
        Integer[] idxs = new Integer[s];
        Integer sum, pos;
        for (int i = 0; i < s; i++) idxs[i] = i;  // Index-Array befüllen
       

        while (true) {
            sum = arr[idxs[0]] + arr[idxs[1]] + arr[idxs[2]];
            System.out.println(String.format("%4d, %4d, %4d, Summe: %5d", arr[idxs[0]], arr[idxs[1]], arr[idxs[2]], sum));
            
            for (pos = s - 1; pos >= 0; pos--) {  // Index-Array von hinten durchgehen
                if (idxs[pos] < l - s + pos) {  // Index an dieser Position kann erhöht werden
                    break;
                }
            }
            if (pos >= 0) {  // Wenn es erhöhbaren Index gibt
                idxs[pos]++;  // Index erhöhen
                for (int fill_pos = pos + 1; fill_pos < s; fill_pos++) {
                    idxs[fill_pos] = idxs[fill_pos - 1] + 1;  // Nachfolgende Indizes aufsteigend auffüllen
                }
            } else {  // Alle Dreier-Kombinationen wurden erreicht
                break;
            }
        }
    }
}