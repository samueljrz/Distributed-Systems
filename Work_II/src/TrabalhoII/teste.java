package TrabalhoII;

import com.google.gson.Gson;

public class teste {
	
	public static void main(String[] args) {

		Casa casa = new Casa("Azul", 7, "Rua X, numero 100, SP, Brasil");
		Apartamento ap = new Apartamento("Ceramica Preta", 8, "Rua Pinhos, numero 1955, CE, Brasil");
		Sitio sitio = new Sitio("Branco", 20, "Rua do Boi, numero 1150, MG, Brasil");
		
		Gson gson = new Gson();
		
		String datacasa = gson.toJson(casa);
		String dataap = gson.toJson(ap);
		String datasitio = gson.toJson(sitio);
		
		System.out.println(datacasa + "\n" + dataap + "\n" + datasitio);
	}
	
}
