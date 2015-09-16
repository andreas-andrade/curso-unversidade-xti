import java.util.Scanner;

public class Operador{
	public static void main (String args[]){
	
		/*AULA 13 - OPERADORES*/
		//2+3; Operador binário
		//-2; operador unário de negatividade
		//true ? "sim" : "não" - operador ternário
		
		//int x = 9 + 4;
		//String s = "9" + "4";
		//double y = (7 - 4 + 2) * 3;
		//System.out.println(y);
		//---------------------------------------------------
		/*AULA 14 - OPERADORES*/
		
		String j = "Oi " + "progrador Java";
		System.out.println(j);
		
		double d = -4;
		double y = 98;
		y++; //pós-incremento. o número só é incrementado na linha de baixo.
		System.out.println(--d); //isso é chamado de pré incremento
		System.out.println((int)d);
		System.out.println("y é = " + ++y);
		
		//comparadores
		Integer x = 8; //Antes da versão 7.0: Integer x = new Integer(8);
		System.out.println("x" instanceof String);//instanceof verifica se a instancia de um objeto é de um determinado tipo 
		
		//AULA 16 - operadores lógicos
		
		int num = 9;
		//System.out.println((num > 5) || (x < 8));
		System.out.println(!(num >= 1));
		
		//AULA 17- operadores de atribuicao
		
		int num2 = 6;
		System.out.println(num2 %= 3);
		System.out.println(num2);
		
		//AULA 18 - OPERADORES ESPECIAIS
		int idade = 6;
		String result = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		System.out.println(result);
		
		String sexo = "M";
		result = (sexo == "F") ? "Sexo feminino" : "Sexo masculino";
		System.out.println(result);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o radio da circunferencia: ");
		
		//calculo do diametro
		double raio = scan.nextDouble();;
		double diametro = 2 * raio;
		System.out.println("Diametro = " + diametro);
		
		//calculo do cumprim. circunferencia
		double circ;
		double pi = Math.PI;
		circ = 2 * pi * raio;
		System.out.println("Circunferencia = " + circ);
		
		//calculo da area do círculo : PI * R²
		double area = pi * (raio * raio);
		System.out.println("Area = " + area);
	}
	
}