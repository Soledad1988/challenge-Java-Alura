package challenge_Java_Alura;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		
		String menu = (JOptionPane.showInputDialog(null,"Selecciones el conversor","Conversores",JOptionPane.PLAIN_MESSAGE,
				null, new Object[] {"Conversor de monedas","Conversor de Temperatura"},"Seleccionar")).toString();
		
		if(menu.toString().equals("Conversor de monedas")) {
			Object[] monedas = {"De Peso a Dolar", "De Peso a Euro", "De Peso a Libras",
					"De peso a Yen", "De Peso a Won Coreano", "De Dolar a Peso", "De Euro a Peso", "De Libras a Peso"};
			
			JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", null, JOptionPane.QUESTION_MESSAGE, 
					null, monedas, monedas[0]);
		}else {
			JOptionPane.showMessageDialog(null,"Por el momento no esta habilitado");
		}
	}
}
