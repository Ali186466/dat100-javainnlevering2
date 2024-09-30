package no.hvl.dat100.tabeller;

	public class Tabeller {

	    // a) Skriv ut tabell
	    public static void skrivUt(int[] tabell) {
	        for (int i = 0; i < tabell.length; i++) {
	            System.out.print(tabell[i] + " ");
	        }
	        System.out.println();  // Ny linje etter utskrift
	    }

	    // b) Returner en tekststreng med innholdet av en tabell
	    public static String tilStreng(int[] tabell) {
	        StringBuilder sb = new StringBuilder();
	        sb.append("[");
	        for (int i = 0; i < tabell.length; i++) {
	            sb.append(tabell[i]);
	            if (i < tabell.length - 1) {
	                sb.append(",");
	            }
	        }
	        sb.append("]");
	        return sb.toString();
	    }

	    // c) Beregn summen av tallene i en tabell
	    public static int summer(int[] tabell) {
	        int sum = 0;
	        for (int i : tabell) {
	            sum += i;
	        }
	        return sum;
	    }

	    // d) Sjekk om et tall finnes i tabellen
	    public static boolean finnesTall(int[] tabell, int tall) {
	        for (int i : tabell) {
	            if (i == tall) {
	                return true;
	            }
	        }
	        return false;
	    }

	    // e) Finn posisjonen til et tall i tabellen
	    public static int posisjonTall(int[] tabell, int tall) {
	        for (int i = 0; i < tabell.length; i++) {
	            if (tabell[i] == tall) {
	                return i;
	            }
	        }
	        return -1;  // Returner -1 hvis tallet ikke finnes
	    }

	    // f) Returner en ny tabell som er reversert
	    public static int[] reverser(int[] tabell) {
	        int[] reversert = new int[tabell.length];
	        for (int i = 0; i < tabell.length; i++) {
	            reversert[i] = tabell[tabell.length - 1 - i];
	        }
	        return reversert;
	    }

	    // g) Sjekk om tabellen er sortert stigende
	    public static boolean erSortert(int[] tabell) {
	        for (int i = 1; i < tabell.length; i++) {
	            if (tabell[i] < tabell[i - 1]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // h) Returner en ny tabell som er sammensetning av to tabeller
	    public static int[] settSammen(int[] tabell1, int[] tabell2) {
	        int[] nyTabell = new int[tabell1.length + tabell2.length];
	        for (int i = 0; i < tabell1.length; i++) {
	            nyTabell[i] = tabell1[i];
	        }
	        for (int i = 0; i < tabell2.length; i++) {
	            nyTabell[tabell1.length + i] = tabell2[i];
	        }
	        return nyTabell;
	    }

	    // Test metodene i main-metoden
	    public static void main(String[] args) {
	        int[] tabell1 = {1, 2, 3};
	        int[] tabell2 = {4, 5, 6};

	        // a) Test av skrivUt
	        System.out.println("a) Test skrivUt:");
	        skrivUt(tabell1); // Forventet ut: 1 2 3

	        // b) Test av tilStreng
	        System.out.println("b) Test tilStreng:");
	        System.out.println(tilStreng(tabell1)); // Forventet ut: [1,2,3]

	        // c) Test av summer
	        System.out.println("c) Test summer:");
	        System.out.println(summer(tabell1)); // Forventet ut: 6

	        // d) Test av finnesTall
	        System.out.println("d) Test finnesTall:");
	        System.out.println(finnesTall(tabell1, 2)); // Forventet ut: true
	        System.out.println(finnesTall(tabell1, 5)); // Forventet ut: false

	        // e) Test av posisjonTall
	        System.out.println("e) Test posisjonTall:");
	        System.out.println(posisjonTall(tabell1, 2)); // Forventet ut: 1
	        System.out.println(posisjonTall(tabell1, 5)); // Forventet ut: -1

	        // f) Test av reverser
	        System.out.println("f) Test reverser:");
	        int[] reversert = reverser(tabell1);
	        skrivUt(reversert); // Forventet ut: 3 2 1

	        // g) Test av erSortert
	        System.out.println("g) Test erSortert:");
	        System.out.println(erSortert(tabell1)); // Forventet ut: true
	        System.out.println(erSortert(reversert)); // Forventet ut: false

	        // h) Test av settSammen
	        System.out.println("h) Test settSammen:");
	        int[] sammensatt = settSammen(tabell1, tabell2);
	        skrivUt(sammensatt); // Forventet ut: 1 2 3 4 5 6
	    }
	}
