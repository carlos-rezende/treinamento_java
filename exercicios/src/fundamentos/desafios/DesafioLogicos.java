package fundamentos.desafios;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador unario! - nega��o logica
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println( "Comprou Tv 50\"? " + comprouTV50);
		System.out.println( "Comprou Tv 32\"? " + comprouTV32);
		System.out.println( "Comprou sorvete ? " + comprouSorvete);
		System.out.println( "Mais Saudavel ? " + maisSaudavel);
		
		
	}

}
