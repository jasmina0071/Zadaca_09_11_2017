import java.util.Scanner;
public class ZadatajBr3 {
	public static void main(String[] args) {

	        Scanner unos = new Scanner(System.in);
	        System.out.print("Molimo unesite iznos: ");
	        int iznos = unos.nextInt();
	       
	        int novcic = iznos /5; 
	        iznos %= 5;                  
           
	        novcic += iznos/3;  
	        iznos %= 3;               
           
	        novcic += iznos;    

	        System.out.println("Najmanji broj novčića za plaćanje je: " + novcic + " .");
						
				unos.close();	
}
	}