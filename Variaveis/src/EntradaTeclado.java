import java.util.Scanner;

public class EntradaTeclado {

	public static void main(String[] args) {
		
		//Usu�rio digitar o valor
		
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in); //met�do para entrada de valores 
		
		System.out.println("Digite seu nome");
		
		nome = teclado.next(); //usamos o next para colocar 
		
		System.out.println("Digite sua idade");
		
		idade = teclado.nextInt(); 
		
		System.out.println("O seu nome � "+nome+ " e sua idade "+ idade + " anos");

	}

}
