/*
 * Apresentar os conceitos de variáveis
 * @author: Andreas Andrade Adelino
 */
public class Variavel{
	public static void main(String args[]){
	
		Integer idade = new Integer(24);
		Double altura = new Double("1.82");
		double d = altura.doubleValue();
		float f = altura.intValue();
		byte b = altura.byteValue();
		//System.out.println(d + f + b);
		Boolean casado = new Boolean("false");
		//conversão estática
		double d1 = Double.parseDouble("1.1234");
		int i = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		int i2 = Integer.valueOf("1011", 2);
		System.out.println(i2);
	}
}