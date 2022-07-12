/**
 * 
 */
package modelo;

/**
 * @author David
 *
 */
public class Planeta {

	private String nombre;
	private int numSatelites;
	private double masaKg;
	private double volumenKm;
	private int diametroKm;
	private int distanciaSol;
	private String tipoPlaneta;
	private boolean visible;
	
	public static final int UA = 149597870;
	
	
	public Planeta() {
		this.nombre=null;
		this.numSatelites=0;
		this.masaKg=0;
		this.volumenKm=0;
		this.diametroKm=0;
		this.distanciaSol=0;
		this.tipoPlaneta="TERRESTRE";
		this.visible=false;
	}
	
	public String compruebaTipo(String tipo) {
		if (tipo.equalsIgnoreCase("GASEOSO") || 
				tipo.equalsIgnoreCase("ENANO")) {
			return tipo.toUpperCase();
		}
		return "TERRESTRE";
	}

	public Planeta(String nombre, int numSatelites, double masaKg, double volumenKm, int diametroKm, int distanciaSol,
			String tipoPlaneta, boolean visible) {
		this.nombre = nombre;
		this.numSatelites = numSatelites;
		this.masaKg = masaKg;
		this.volumenKm = volumenKm;
		this.diametroKm = diametroKm;
		this.distanciaSol = distanciaSol;
		this.tipoPlaneta = compruebaTipo(tipoPlaneta);
		
		/*if (compruebaTipo(tipoPlaneta)) {
			this.tipoPlaneta=tipoPlaneta;
		} else {
			this.tipoPlaneta="TERRESTRE";
		}*/
		
		this.visible = visible;
	}
	
	public Planeta(Planeta p) {
		this.nombre = p.nombre;
		this.numSatelites = p.numSatelites;
		this.masaKg = p.masaKg;
		this.volumenKm = p.volumenKm;
		this.diametroKm = p.diametroKm;
		this.distanciaSol = p.distanciaSol;
		this.tipoPlaneta = compruebaTipo(p.tipoPlaneta);
		this.visible = p.visible;
	}

	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", numSatelites=" + numSatelites + ", masaKg=" + masaKg + ", volumenKm="
				+ volumenKm + ", diametroKm=" + diametroKm + ", distanciaSol=" + distanciaSol + ", tipoPlaneta="
				+ tipoPlaneta + ", visible=" + visible + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumSatelites() {
		return numSatelites;
	}

	public void setNumSatelites(int numSatelites) {
		this.numSatelites = numSatelites;
	}

	public double getMasaKg() {
		return masaKg;
	}

	public void setMasaKg(double masaKg) {
		this.masaKg = masaKg;
	}

	public double getVolumenKm() {
		return volumenKm;
	}

	public void setVolumenKm(double volumenKm) {
		this.volumenKm = volumenKm;
	}

	public int getDiametroKm() {
		return diametroKm;
	}

	public void setDiametroKm(int diametroKm) {
		this.diametroKm = diametroKm;
	}

	public int getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public String getTipoPlaneta() {
		return tipoPlaneta;
	}

	public void setTipoPlaneta(String tipoPlaneta) {
		this.tipoPlaneta = tipoPlaneta;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public double densidad() {
		return this.masaKg/this.volumenKm;
	}
	
	public boolean esExterior() {
		double distanciaUA= this.distanciaSol/(UA/1000000.0);
		if (distanciaUA>3.4) {
			return true;
		}
		return false;
	}
	
}
