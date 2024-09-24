package no.hvl.dat100.tabeller;

public class Tabeller {
	
	int x[] = {11, 22, 33, 44, 55, 66};
	int t = 4;

	// a)
	public static void skrivUt(int[] tabell) {
		
		for ( int tall : tabell) {
			System.out.print(tall + " ");
		}
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
		int i = 0;
		for (int tabelltall : tabell) {
			if (tabelltall == tall) {
				return i;
			}
			i += 1;
		}
		return (-1);	
	}
	int posijon = Tabeller.posisjonTall(x, t);
	System.out.print(posisjon);

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
