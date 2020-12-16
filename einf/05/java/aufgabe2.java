
import java.util.Arrays;

public class aufgabe2 {
    public static void main (String[] args) {
        // Eingabe der beiden 2D-Matrizen
        Integer[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] mat2 = {{10}, {20}, {30}};

        // Dimensionen prüfen
        Integer m1, n1, m2, n2;
        m1 = mat1.length;
        n1 = mat1[0].length;
        m2 = mat2.length;
        n2 = mat2[0].length;
        if (n1 != m2) {
            System.out.println("Matrizendimensionen nicht für Multiplikation geeignet!");
            return;
        }

        // Output-Matrix erstellen
        Integer[][] out = new Integer[m1][n2];

        // Zeilen und Spalten von out durchgehen
        for (int row = 0; row < m1; row++) {
            for (int col = 0; col < n2; col++) {

                // Skalarprodukt Zeile * Spalte ausführen
                out[row][col] = 0;
                for (int pos = 0; pos < n1; pos++) {
                    out[row][col] += mat1[row][pos] * mat2[pos][col];
                }
            }
        }

        // Ergebnisausgabe
        System.out.println(Arrays.deepToString(out).replace("], ", "]\n"));
    }
}
