package challenge_Java_Alura;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		
		Object[] opcion = {"Conversor de Monedas", "Conversor de Temperaturas"};
		
		JOptionPane.showInputDialog(null, "Selecciones un Conversor", null, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
	
	}
}
