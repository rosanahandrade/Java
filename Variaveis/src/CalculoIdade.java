
public class CalculoIdade {

	public static void main(String[] args) {
		//Calculo de Idade
		
		String nome = "Rosana";
		String cargo = "Analista";
		int dt_nasc = 1989;
		int dt_atual = 2022;
		int resultado = dt_atual - dt_nasc;
		
		
		if(resultado < 18 ) {
			System.out.println("Funcion�rio menor de idade");
				
		}else {
			
			System.out.println("Funcion�rio maior de idade");
		}
			
			
			
			
			
		/*
		
		System.out.println("A funcion�ria "+nome+ " do cargo "+cargo+ " tem "+resultado+ " anos." );
		
		//Calculando direto na tela sem colocar um resultado em uma variavel
		System.out.println("A funcion�ria "+nome+ " do cargo "+cargo+ " tem "+ (dt_atual - dt_nasc)+ " anos.");
		

		//Usando o PrintF
		System.out.println(" ");
		
		System.out.printf("A funcion�ria %s\n do cargo %s\n tem %d\n anos", nome, cargo, resultado);
		*/
	}

}
