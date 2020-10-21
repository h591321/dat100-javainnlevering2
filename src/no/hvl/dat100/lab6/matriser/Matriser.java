package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i[] : matrise) {
			System.out.print("[");
			for (int j : i) {
				System.out.print(j+" ");
			}
			System.out.println("]");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String ut = "";
		for (int r[] : matrise) {
			for (int i : r) {
				ut+= i + " ";
			}
			ut += "\n";
		}
		return ut;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[] lengde = matrise [0];
		for (int i = 0; i < matrise.length ; i++) {
			for (int k = 0 ; k< lengde.length; k++) {
				matrise [i][k] = (matrise [i][k])*tall;
			}
		}
		return matrise;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean sjekk = false;
		if (a.length!=b.length) {return sjekk;}
		int [] lengde1 = a[0];
		int [] lengde2 = b[0];
		if (lengde1.length!=lengde2.length) {return sjekk;}
		sjekk = true;

		for (int i = 0 ; i < a.length ; i++) {
			for (int k = 0 ; k < lengde1.length; k++) {
				if (a[i][k]!=b[i][k]) {
					sjekk=false;
				}
			}
		}
		
		return sjekk;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
