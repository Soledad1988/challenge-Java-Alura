package challenge_Java_Alura;

import javax.swing.JOptionPane;


public class Conversor {

	public static void main(String[] args) {
		
		String menu = (JOptionPane.showInputDialog(null,"Selecciones el conversor","Conversores",JOptionPane.PLAIN_MESSAGE,
				null, new Object[] {"Conversor de monedas","Conversor de Temperatura"},"Seleccionar")).toString();
		
		if(menu.toString().equals("Conversor de monedas")) {
			Object[] monedas = {"De Peso a Dolar", "De Peso a Euro", "De Peso a Libras",
					"De peso a Yen", "De Peso a Won Coreano", "De Dolar a Peso", "De Euro a Peso", "De Libras a Peso"};
			
			Object elegirMoneda = JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero", 
					"Menu",JOptionPane.QUESTION_MESSAGE,null,monedas, monedas[0]);
			
			// por si no elige ninguna opcion de conversion
			if (elegirMoneda==null) {
				JOptionPane.showInputDialog(null,"Salio del conversor");
				
			// por si escoge no seguir se sale del programa
				System.exit(0);
			}
			
			try {
				//ingresar valor a convertir
				String cantidadDinero=JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir ");
				
			
			}
			// por si se  ingresa un valor  no permitido
			catch(NumberFormatException | NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Solo se permiten números");
				
			}
			
			
		}else {
			JOptionPane.showMessageDialog(null,"Por el momento no esta habilitado");
		}
	}
	
	
	
}
