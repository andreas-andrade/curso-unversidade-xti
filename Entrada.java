import java.util.Scanner;
public class Entrada{
	public static void main(String args[]){
		//dados na chamada do programa. 
		//entra direto com os valores depois do nome no prompt
		//System.out.println(args[0]);
		//interagindo com o usuário
		System.out.print("Qual o seu nome:");
		Scanner s = new Scanner(System.in);
		System.out.println("Bem vindo " + s.nextLine());
	}
}