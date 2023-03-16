package challenge_Java_Alura;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		
		//Instanciar monedas
				Moneda dolar = new Moneda(202.56,"USD");
				Moneda euro = new Moneda(215.13,"EUR");
				Moneda libra = new Moneda(245.12,"GBP");
		
		String menu = (JOptionPane.showInputDialog(null,"Selecciones el conversor","Conversores",JOptionPane.PLAIN_MESSAGE,
				null, new Object[] {"Conversor de monedas","Conversor de Temperatura"},"Seleccionar")).toString();
		
		if(menu.toString().equals("Conversor de monedas")) {
			
			String moneda = (JOptionPane.showInputDialog(null,"Selecciones la moneda","Monedas",JOptionPane.PLAIN_MESSAGE,
					null, new Object[] {"De Peso a Dolar", "De Peso a Euro", "De Peso a Libras",
							"De peso a Yen", "De Peso a Won Coreano", "De Dolar a Peso",
							"De Euro a Peso","De Libras a Peso"},"Seleccionar")).toString();
			
			
			switch(moneda) {
			case "De Peso a Dolar":
				convertir(dolar.getCotizacion(),"USD");
			break;
			
			case "De Peso a Euro":
				convertir(euro.getCotizacion(),"EUR");
			break;
			
			case "De Peso a Libras":
				convertir(libra.getCotizacion(),"GBP");
			break;
			
			case "De peso a Yen":
				convertir(libra.getCotizacion(),"JPY");
			break;
			
			case "De Peso a Won Coreano":
				convertir(libra.getCotizacion(),"KRW");
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
		
		JOptionPane.showInternalMessageDialog(null, "Representa "+conversion);
	}

		
}
