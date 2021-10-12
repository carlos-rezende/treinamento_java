package fundamentos.desafios;

import java.util.Scanner;

public class DesafoCalculadora {
	
	public static void main(String[] args) {
	
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print(" Informe o numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a Opera��o: ");
		String op = entrada.next();
		
		//Logica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f2",
				num1, op, num2, resultado);
		
		entrada.close();
		
	
		
		
	}

}
