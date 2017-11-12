import java.util.Scanner;
public class ZadatakBr4 {
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		 
		 System.out.println("Unesite željeni string: ");
		 String nekiString=unos.nextLine();
		 
		 char slova;
		 int brojac=0;
		 
		 for (int i = 0 ; i<nekiString.length(); i++) {
	 			slova = nekiString.charAt(i);
	 			
	 			if (Character.isUpperCase(slova)) {
	 				brojac++;
	 				
	 		   }
		  }
		 
		 System.out.println("Velikih slova ima: " + brojac);
	}
}
