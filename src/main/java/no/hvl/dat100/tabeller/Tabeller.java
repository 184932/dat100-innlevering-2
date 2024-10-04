package no.hvl.dat100.tabeller;

public class Tabeller {
	
	int x[] = {11, 22, 33, 44, 55, 66};
	int t = 4;

	// a)
	public static void skrivUt(int[] tabell) {
		
		for ( int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder sb = new StringBuilder ("[");
		for (int i = 0; i < tabell.length; i++) {
			sb.append(tabell[i]);
			if (i < tabell.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int tall : tabell) {
			sum += tall;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int tabelltall : tabell) {
			if (tabelltall == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return (-1);	
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] rtabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			
			rtabell[tabell.length-i-1] = tabell[i];
			
		}
		return (rtabell);
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
			int x1 = tabell[i-1];
			int x2 = tabell[i];
			if (x1 > x2) {
				return false;
			}
		}
		return true;
	}
		

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] tabell = new int[tabell1.length+tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			tabell[i] = tabell1[i];
		}
		for (int i = tabell1.length; i < (tabell1.length + tabell2.length); i++) {
			tabell[i] = tabell2[i-tabell1.length];
		}
		return (tabell);
	}
}
