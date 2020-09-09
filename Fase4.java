import java.util.*;
public class Fase4 {
	
	public static void main(String args[]) { 
	
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introdueix el teu nom: ");
		String nom=entrada.nextLine();

		System.out.println("Introdueix el teu primer cognom: ");
		String cognom=entrada.nextLine();
		
		System.out.println("Introdueix el teu segon cognom: ");
		String cognom2=entrada.nextLine();
		
		System.out.println("Introdueix el teu dia de naixement: ");
		int dia=entrada.nextInt();
		
		System.out.println("Introdueix el teu mes de naixement: ");
		int mes=entrada.nextInt();
		
		System.out.println("Introdueix el teu any de naixement: ");
		int any=entrada.nextInt();
	
		String nomComplet =(nom+" "+cognom+" "+cognom2);
		String dataNaixement =(dia+"/"+mes+"/"+any);
	
		System.out.println("El meu nom és "+nomComplet);
		System.out.println("Vaig néixer el "+dataNaixement);
	
		if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {
			System.out.println("El meu any de naixement no és de traspàs");
		}
	 }
  }