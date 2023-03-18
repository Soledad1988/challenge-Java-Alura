package challenge_Java_Alura;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		
		//Instanciar monedas
				Moneda dolar = new Moneda(202.94,"USD");
				Moneda euro = new Moneda(215.13,"EUR");
				Moneda libra = new Moneda(245.12,"GBP");
				Moneda yen = new Moneda();
				yen.setCotizacion(1.54);
				Moneda won = new Moneda();
				won.setCotizacion(0.16);
		
				
		while(true) {
		
			//----------Menú ------------------------
		try {
		String menu = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión","Menu",JOptionPane.PLAIN_MESSAGE,
				null, new Object[] {"Conversor de monedas","Conversor de Temperatura"},"Seleccionar")).toString();
		
			if(menu.toString().equals("Conversor de monedas")) {
				
				String moneda = (JOptionPane.showInputDialog(null,"Elije la moneda a la que desea convertir su dinero","Monedas",JOptionPane.PLAIN_MESSAGE,
						null, new Object[] {"De Peso a Dolar", "De Peso a Euro", "De Peso a Libras",
								"De peso a Yen", "De Peso a Won Coreano", "De Dolar a Pesos",
								"De Euro a Pesos","De Libras a Pesos"},"Seleccionar")).toString();
			
				
			
			switch(moneda) {
			case "De Peso a Dolar":
				pesosDivisas(dolar.getCotizacion(),"USD");
				finalizar();
			break;
			
			case "De Peso a Euro":
				pesosDivisas(euro.getCotizacion(),"EUR");
				finalizar();
			break;
			
			case "De Peso a Libras":
				pesosDivisas(libra.getCotizacion(),"GBP");
				finalizar();
			break;
			
			case "De peso a Yen":
				pesosDivisas(yen.getCotizacion(),"JPY");
				finalizar();
			break;
			
			case "De Peso a Won Coreano":
				pesosDivisas(won.getCotizacion(),"KRW");
				finalizar();
			break;
			
			case "De Dolar a Peso":
				divisasPesos(dolar.getCotizacion(),"USD");
				finalizar();
			
			case "De Dolar a Pesos":
				divisasPesos(dolar.getCotizacion(),"$");
				finalizar();
				
			case "De Euro a Pesos":
				divisasPesos(dolar.getCotizacion(),"$");
				finalizar();
				
			case "De Libras a Pesos":
				divisasPesos(dolar.getCotizacion(),"$");
				finalizar();
			
			default:
				
			break;
			}
			
			
		}else {
			JOptionPane.showMessageDialog(null,"Por el momento no esta habilitado\n"+"\nLo estoy programando..");
			finalizar();
		}}
		catch(NullPointerException ex){
			finalizar();
		}}

		
	}
	
	//------conversor divisas a pesos--------------
	
	static void pesosDivisas(double valorMoneda, String moneda) {//divisasPesos
		double valorIngresado = 0;
		
		try {
			valorIngresado = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de dinero que desea convertir "));
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Solo se permiten números");
		}
		
		double conversion = valorIngresado / valorMoneda;
		
		conversion = (double)Math.round(conversion * 100d)/100;
		
		JOptionPane.showInternalMessageDialog(null, "Representa "+moneda+" "+conversion);
	}
	
	//------conversor pesos a divisas--------------
	static void divisasPesos(double valorIngresado, String moneda) {//pesosDivisas
		double valorMoneda = 0;
		
		try {
			valorMoneda = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de divisas que desea convertir "));
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Solo se permiten números");
		}
		
		double conversion = valorIngresado * valorMoneda;
		
		conversion = (double)Math.round(conversion * 100d)/100;
		
		JOptionPane.showInternalMessageDialog(null, "Representa "+moneda+" "+conversion);
	}
	
	
	//-------Funcion Finalizar el programa------------------
		public static void finalizar() {
			int resp = JOptionPane.showConfirmDialog(null, "Desea Continuar\n",null, 
					JOptionPane.YES_NO_CANCEL_OPTION/*Las opciones (si o no)*/);

			if(resp ==JOptionPane.NO_OPTION || resp ==JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa finalzado\n"+"\nGracias!!");
				System.exit(0);
			}
				
		}

}
