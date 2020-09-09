import java.util.*;
public class Fase3 {
	
	public static void main(String args[]) { 
	
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introdueix el teu any de naixement: ");
	
	int anyNaixement=entrada.nextInt();
	boolean esTraspas=false; //Soy consciente de que no lo he utilizado.

	for(int any=1948; any<=anyNaixement;any++) {
		
		if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
			System.out.println("L'any  "+any+" va ser de traspàs.");
		} else {
			System.out.println("L'any  "+any+" no va ser de traspàs.");	
		}
	 }
  }
}