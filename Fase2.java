import java.util.*;
public class Fase2 {
	
	public static void main(String args[]) { 
	
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introdueix el teu any de naixement: ");
	
	int anyNaixement=entrada.nextInt();
	
	final int any=1948; //No estic utilitzant aquesta variable
	int traspas=1948;
	int traspasCont=0;
	
	while(traspas <= anyNaixement) {
			
			traspas = traspas+4;
			traspasCont=traspasCont+1;
	}	
	
	System.out.println("Hi ha  "+(traspasCont -1) +" anys de traspas entre el teu any de naixament i 1948, comptant també el teu any de naixement.");
		
  }
}