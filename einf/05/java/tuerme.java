
public class tuerme {
    public static void main (String[] args) {
        boolean[][] arr = {{false, false, true, false, false, false, false, false},
                           {false, false, false, false, false, true, false, false},
                           {false, false, false, false, false, false, false, true},
                           {true, false, false, false, false, false, false, false},
                           {false, false, false, true, false, false, false, false},
                           {false, false, false, false, false, false, true, false},
                           {false, false, false, false, true, false, false, false},
                           {false, true, false, false, false, false, false, false}};

        int n = arr.length;
        int y, x;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (arr[row][col]) {  // Turm an Position vorhanden
                    // Zeile nach Kollisionen durchsuchen
                    y = row;
                    for (x = 0; x < n; x++) {
                        if (x == col) continue;
                        if (arr[y][x]) {
                            System.out.println("Die Türme wurden nicht korrekt aufgestellt!");
                            return;
                        }
                    }
                    // Spalte nach Kollisionen durchsuchen
                    x = col;
                    for (y = 0; y < n; y++) {
                        if (y == row) continue;
                        if (arr[y][x]) {
                            System.out.println("Die Türme wurden nicht korrekt aufgestellt!");
                            return;
                        }
                    }
                
                }
            }
        }
        System.out.println("Die Türme wurden richtig aufgestellt!");
    }
}
