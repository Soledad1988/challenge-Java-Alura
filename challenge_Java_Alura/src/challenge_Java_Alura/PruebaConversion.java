package challenge_Java_Alura;

import javax.swing.JOptionPane;

public class PruebaConversion {

	public static void main(String[] args) {
		
		Moneda dolar = new Moneda(198.75);
		double pesos = 0;
		
		try {
			pesos = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de dinero que desea convertir "));
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Solo se permiten números");
		}
		
			
		double conversor = (pesos/dolar.getCotizacion());
		
		double convers = (double)Math.round(conversor * 100d)/100;
		
		
		JOptionPane.showInternalMessageDialog(null, "Representa "+convers +" Dolares");
		

	}
}
