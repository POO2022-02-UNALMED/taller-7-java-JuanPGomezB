package comunicacion;
import java.util.*;

public class Alfabeto extends Pictograma{
	String[] letras;
	String interpretacion;
	
	public int cantidadLetras() {
		return letras.length;
		
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return Arrays.toString(letras).replace("[", "")
                .replace("]", "");
	}
	

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		
	}

}
