package taller7;

public abstract class Pictograma {
	private String origen;
	
	abstract String interpretacion();
	public String toString() {
		return "Hola " + origen;
	}
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	public Pictograma(String origen) {
		this.origen = origen;
	}
	

	
}
