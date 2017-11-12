import java.util.Scanner;
public class ZadatakBr1 {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		char slovo;
		int brojac = 0;
		double procent = 0;
		
		System.out.println("Unesite neki string: ");
		String unosKorisnika = unos.nextLine();
		
		for (int i = 0; i < unosKorisnika.length(); i++) {
			slovo = unosKorisnika.charAt(i);
			
			if (Character.isUpperCase(slovo)) {
				brojac++;
				
			procent = 100 * brojac / unosKorisnika.length();
				
			}
		}
		System.out.println("Velikih slova ima " + brojac + ", odnosno " + procent + " %.");
	}
}