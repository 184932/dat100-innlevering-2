package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int element : rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder sb = new StringBuilder ();
		for (int[] rad : matrise) {
			for (int element : rad) {
				sb.append(element + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int antallRader = matrise.length;
		int antallKolonner = matrise[0].length;
		int[][] nyMatrise = new int[antallRader][antallKolonner];
		
		for (int i = 0; i < antallRader; i++) {
			for (int j = 0; j < antallKolonner; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int antallRaderA = a.length;
		int antallKolonnerA = a[0].length;
		int antallRaderB = b.length;
		int antallKolonnerB = b[0].length;
		
		if (antallRaderA != antallRaderB || antallKolonnerA != antallKolonnerB ) {
			return false;
		}
		for (int i = 0; i < antallRaderA; i++) {
			for (int j = 0; j < antallKolonnerA; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
