package ppal;

import modelo.Planeta;

public class PruebaPlaneta {

	public static void main(String[] args) {
		
		Planeta p1 = new Planeta("saturno", 200, 5.688E26, 8.27E23, 
				120536, 1418, "GASEOSO", true);
		
		Planeta p2 = new Planeta("marte", 2	, 6.41E23, 1.63E11, 
				6772, 228, "TERRESTRE", true);
		
		System.out.println("informacion de saturno: "+p1);
		System.out.println("informacion de marte: "+p2);
		
		System.out.println("La densidad de saturno es: "+p1.densidad());
		System.out.println("La densidad de marte es: "+p2.densidad());
		
		System.out.println("saturno es exterior?: "+p1.esExterior());
		System.out.println("Marte es exterior? "+p2.esExterior());

	}

}
