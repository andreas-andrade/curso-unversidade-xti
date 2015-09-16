import java.util.Scanner;
import java.util.Random;

public class JogoDeDados{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int escolha, resultadoDoRandom;
		
		System.out.println("*******Bem vindo ao jogo do dado********");
		System.out.println("Escolha um número de 1 a 6: ");
		escolha = scanner.nextInt();
		Random r = new Random();
		resultadoDoRandom = r.nextInt(6) + 1;
		if(resultadoDoRandom == escolha){
			System.out.println("Você acertou!!");
		} else{
			System.out.println("Você errou. O numero foi: " + resultadoDoRandom);
		}
	}
}