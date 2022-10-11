package taller7;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public int palabrasTotales(int x) {
		return x*1*getPaginas();
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+getEnsenanza()+"\n";
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	
	
	

}
