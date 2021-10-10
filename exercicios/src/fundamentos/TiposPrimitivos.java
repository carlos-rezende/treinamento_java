package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionario
		
		// Tipos numericos inteiros
	
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		long pontosAcumulado = 3_134_845_223L;
		int id = 56789;
	
	//Tipos Numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de Empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		//pontos por Real
		
		System.out.println(pontosAcumulado / vendasAcumuladas);
		System.out.println(id + ": ganha ->" + salario);
		System.out.println(" Férias ? " + estaDeFerias);
		System.out.println(" Status: " + status);
		
		
		
	
	}
	
	
	

}
