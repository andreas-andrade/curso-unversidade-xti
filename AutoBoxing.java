//Aula 31 - Autoboxing

public class AutoBoxing{
	public static void main(String[] args){
		
		//maneira antiga - java 5 pra baixo
		Integer x = new Integer(555);//empacotado
		int a = x.intValue();//desempacotou
		a++;
		x = new Integer(a);//re-empacotou
		System.out.println(x.intValue());
		
		//nova maneira
		Integer y = 987;
		y++;//desempacota, incrementa, reempacota
		System.out.println(y.floatValue());
		
		Boolean v = new Boolean("true");
		if(v.booleanValue()){
		// if(v){ tanto esse quanto o de cima funcionam
			System.out.println(v);
		}
		
	}
}