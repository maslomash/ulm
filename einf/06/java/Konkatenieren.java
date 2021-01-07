public class Konkatenieren {

	static String str1 = "  _._     _,-'\"\"`-._     \n (,-.`._,'(       |\\`-/|  \n";
	static String str2 = "     `-.-' \\ )-`( , o o)  \n Katze     `-    \\`_`\"'-   ";

	private static void cat() {
		System.out.println(str1 + str2);
	}

	private static String concat(String a, String b) {
		String retval = a + b;
		if (retval.contains("Katze")) cat();
		return a + b;
	}

	private static String concat(char a, String b) {
		String s = String.valueOf(a);
		return concat(s, b);
	}
	
	public static void main(String[] args) {

		char a = 'K';
		char b = 'H';

		String sa = "atze";
		String sb = "und";

		String e1 = concat(a, sa);
		String e2 = concat(b, sb);
		String e3 = concat(sa, sb);
		String e4 = concat(concat(a, sa), " " + sb + " " + concat(b, sb));

		System.out.println(e1); // Ausgabe: "Katze"
		System.out.println(e2); // Ausgabe: "Hund"
		System.out.println(e3); // Ausgabe: "atzeund"
		System.out.println(e4); // Ausgabe: "Katze und Hund"
	}
}