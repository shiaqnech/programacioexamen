package shop.funcions;

import java.util.ArrayList;

public class Comprovacions{


	public static boolean CheckIfClientExist(ArrayList<RegistraClient> cr, String dni) {

		for (RegistraClient i : cr) {
			if (i.getDni().equals(dni)){
				return true;
			}			
		}
		System.out.println("DNI no existent a la base de dades");
		return false;	
		
	}

	public static boolean comprovarPrintarClientByLetter(String dnibuscar) {

		if (dnibuscar.equalsIgnoreCase("T")){
			return true;
		}
		return false;
	}

	public static boolean comprovarQuanitatSuficient(StockProducte qp, int quanitat) {
		if(quanitat<=qp.getQuanitatstock()){
			return true;
		}
		System.out.println("No hi ha la suficient quanitat d'aquest producte: ");
		return false;
	}

}