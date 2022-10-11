package taller7;

public class main {

	public static void main(String[] args) {
		Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
				new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
				"Alfabeto latino");
		System.out.println(alfabeto.toString());
		
		Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, 
				"no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
		
		System.out.println(fabula.toString());
		
		Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},
				"Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
		System.out.println(tesis.toString());

	}

}
