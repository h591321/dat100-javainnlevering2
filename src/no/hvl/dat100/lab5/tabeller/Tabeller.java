package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for(int i:tabell) {
			System.out.print(i+" ");
		}
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String ut="[";
		for(int i=0;i<tabell.length;i++) {
			int tall=tabell[i];
			ut+=Integer.toString(tall);
			if(i<tabell.length-1) {ut+=",";}
		}
		ut+="]";
		return ut;
	}

	// c)
	public static int summer(int[] tabell) {
		int Sum=0;
		for(int i:tabell) {
			Sum+=i;
		}
		return Sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finns=false;
		for(int i:tabell) {
			if(i==tall) {finns=true;}
		}
		return finns;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int index=-1;
			for(int i=0;i<tabell.length;i++) {
				if(tabell[i]==tall) {index=i;}
			}

		return index;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] llebat= new int[tabell.length];
		int j=tabell.length-1;
		for(int i=0;i<tabell.length;i++) {
			llebat[j]=tabell[i];
			j--;
		}
		return llebat;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert=true;
		for(int i=0;i<tabell.length-1;i++) {
			if(tabell[i]<=tabell[i+1]) {}
				else {sortert=false;}
			}
		
		return sortert;
	}
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde=tabell1.length+tabell2.length;
		int[] nyTab=new int[lengde];
		for (int i=0;i<tabell1.length;i++) {
			nyTab[i]=tabell1[i];
		}
		int k=0;
		for(int j=tabell1.length;j<lengde;j++) {
			nyTab[j]=tabell2[k];
			k++;
		}
		return nyTab;
	}
}
