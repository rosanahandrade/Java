import java.util.Scanner;

public class EntradaTeclado {

	public static void main(String[] args) {
		
		//Usuário digitar o valor
		
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in); //metódo para entrada de valores 
		
		System.out.println("Digite seu nome");
		
		nome = teclado.next(); //usamos o next para colocar 
		
		System.out.println("Digite sua idade");
		
		idade = teclado.nextInt(); 
		
		System.out.println("O seu nome é "+nome+ " e sua idade "+ idade + " anos");

	}

}
