package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaSolar {

	private String nombre;
	private List<Planeta> lista;
	
	
	public SistemaSolar(String nombre) {
		this.nombre = nombre;
		this.lista = new ArrayList<>();
	}
	
	public void insertaPlaneta(Planeta p) {
		if (!lista.contains(p)) {
			lista.add(p);
		}
	}
	
	
	public boolean modificarPlaneta(Planeta p) {
		int pos = lista.indexOf(p);
		if (pos!=-1) {
			lista.set(pos, p);
			return true;
		}
		return false;
	}
	
	public Planeta buscarPlaneta(Planeta p) {
		int pos = lista.indexOf(p);
		System.out.println("posicion : "+pos);
		if (pos!=-1) {
			return lista.get(pos);
		}
		return null;
	}
	
	public boolean eliminarPlaneta(Planeta p) {
		return lista.remove(p);
	}
	
	public void eliminarPlanetas() {
		lista.clear();
	}
	
	public int getNumPlanetas() {
		return lista.size();
	}

	@Override
	public String toString() {
		String res ="Sistema solar: "+this.nombre+"\n";
		int i=0;
		for (Planeta planeta : lista) {
			res=res+ "Planeta "+i+ " "+planeta+"\n";
			i++;
		}
		return res;
	}
	
	public Planeta planetaMasDenso() {
		Planeta denso = lista.get(0);
		for (Planeta planeta : lista) {
			if (planeta.densidad()>denso.densidad()) {
				denso=planeta;
			}
		}
		return denso;
		
	}
	
}
