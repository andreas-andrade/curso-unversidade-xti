import java.util.Scanner;

public class Fluxo{
	public static void main(String[] args){
		//int idade = 15;
		boolean passou = true;
		// if(idade < 11){
			// System.out.println("E uma crianca.");
		// }
		// else{
			// System.out.println("E um(a) jovem.");
		// }
		if(passou){
			System.out.println("Contratado");
		}
		
		//-------------
		System.out.print("Digite um numero: ");
		Scanner s = new Scanner(System.in);
		int numero = (s.nextInt());
		if(numero % 2 == 0){
			System.out.println("numero par");
		} else{
			System.out.println("numero impar");
		}
		
		//-----------
		System.out.println("Digite a nota do aluno: ");
		double nota = s.nextDouble();
		if(nota >= 7){
			System.out.println("Passou");
		} else{
			System.out.println("Reprovou");
			if(nota >= 6){
				System.out.println("mas pode fazer a recuperacao");
			}
		}
		//AULA 24 - SWITCH
		
		char sexo = 'M';
		switch(sexo){
			case 'M':
				System.out.println("Sexo masculino");
				break;
			case 'F':
				System.out.println("Sexo feminino");
				break;	
			default:
				System.out.println("Outro");
				break;
		}
		
		String tecnologia = "C++";
		switch(tecnologia){
			case "java":
			case "C++":
			case "cobol":
				System.out.println("linguagem de programacao");
				break;
			case "oracle":
			case "sqlserver":
			case "postgresql":
				System.out.println("Banco de dados");
			default:
				System.out.println("Tecnologia desconhecida");
		}
	}
}