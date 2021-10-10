package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor01 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		String valor02 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		
		System.out.println(valor01 + valor02);
		
		double numero1 = Double.parseDouble(valor01);
		double numero2 = Double.parseDouble(valor02);
		
		double soma = numero1 + numero2;
		System.out.println(" Soma é " + soma);
		System.out.println(" Média é " + soma / 2);
		
	}
	
	
	

}
