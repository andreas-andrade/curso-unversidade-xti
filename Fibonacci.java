public class Fibonacci{
	public static void main(String[] args){
		int contador, fibonacci, aux, proximo;
		fibonacci = 0;
		aux = 0;
		contador = 0;
		while(contador < 15){
			if(fibonacci == 0){
				System.out.print(fibonacci + ", ");
				fibonacci = 1;
				aux = 1;
			}else {
					System.out.print(fibonacci + ", ");
					aux = fibonacci - aux;
					fibonacci += aux;
				}
			contador++;
		}
	}
}