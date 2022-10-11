package comunicacion;

public abstract class Pictograma {
	private String origen;
	
	abstract String interpretacion();
	public abstract String toString();
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	public Pictograma(String origen) {
		super();
		this.origen = origen;
	}
	

	
}
