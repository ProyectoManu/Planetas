package ppal;

import java.util.Scanner;

import modelo.Planeta;
import modelo.SistemaSolar;

public class PruebaSistemaSolar {

	public static void main(String[] args) {

		SistemaSolar sistema = new SistemaSolar("Sistema solar");
		
		
		Planeta p1 = new Planeta("saturno", 200, 5.688E26, 8.27E23, 
				120536, 1418, "GASEOSO", true);
		
		
		System.out.println("añadiendo saturno a la lista...");
		sistema.insertaPlaneta(p1);
	
		
		p1 = new Planeta("marte", 2	, 6.41E23, 1.63E11, 
				6772, 228, "TERRESTRE", true);
		
		System.out.println("El sistema solar es: "+sistema);
		
		System.out.println("añadiendo marte a la lista...");
		sistema.insertaPlaneta(p1);
		System.out.println("El sistema solar es: "+sistema);
		
		p1 = new Planeta("marte", 5	, 8.8E34, 3.45E45, 
				1111, 455, "ENANO", false);
		sistema.insertaPlaneta(p1);
		System.out.println("El sistema solar es: "+sistema);
		

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce nombre del planeta a buscar:");
		String nombre = teclado.nextLine();
		
		Planeta buscar = new Planeta();
		buscar.setNombre(nombre);
		
		p1 = sistema.buscarPlaneta(buscar);
		if (p1!=null) {
			System.out.println("El planeta es "+ p1);
		} else {
			System.out.println("Planeta no encontrado");
		}
	}

}
