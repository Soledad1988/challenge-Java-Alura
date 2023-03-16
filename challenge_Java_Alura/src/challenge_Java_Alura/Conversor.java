package challenge_Java_Alura;

import javax.swing.JOptionPane;


public class Conversor {

	public static void main(String[] args) {
		
		String menu = (JOptionPane.showInputDialog(null,"Selecciones el conversor","Conversores",JOptionPane.PLAIN_MESSAGE,
				null, new Object[] {"Conversor de monedas","Conversor de Temperatura"},"Seleccionar")).toString();
		
		if(menu.toString().equals("Conversor de monedas")) {
			
			String moneda = (JOptionPane.showInputDialog(null,"Selecciones la moneda","Monedas",JOptionPane.PLAIN_MESSAGE,
					null, new Object[] {"De Peso a Dolar", "De Peso a Euro", "De Peso a Libras",
							"De peso a Yen", "De Peso a Won Coreano", "De Dolar a Peso",
							"De Euro a Peso","De Libras a Peso"},"Seleccionar")).toString();
			
			// por si no elige ninguna opcion de conversion
			if (moneda==null) {
				JOptionPane.showInputDialog(null,"Salio del conversor");
				
			// por si escoge no seguir se sale del programa
				System.exit(0);
			}
			
			switch(moneda) {
			case "De Peso a Dolar":
				convertir(315.20,"de peso a dolar");
			break;
			
			case "De Peso a Euro":
				convertir(250.20,"de peso a Euro");
			break;
			
			case "De Peso a Libras":
				JOptionPane.showMessageDialog(null,"De Peso a Libras");
			break;
			
			
			default:
				JOptionPane.showMessageDialog(null,"De Peso a Libras");
			break;
			}
			
			
		}else {
			JOptionPane.showMessageDialog(null,"Por el momento no esta habilitado");
		}
	}
	
	//conversor
	
	static void convertir(double valorMoneda, String moneda) {
		double valorIngresado = 0;
		
		try {
			valorIngresado = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de dinero que desea convertir "));
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Solo se permiten números");
		}
		
		double conversion = valorIngresado / valorMoneda;
		
		conversion = (double)Math.round(conversion * 100d)/100;
		
		JOptionPane.showInternalMessageDialog(null, "Representa "+conversion +" Dolares");
	}

		
}
