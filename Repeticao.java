/*
 *Aula 26 - For
 **/

public class Repeticao{
	public static void main(String[] args){
		String texto = "";
		int tamanho = 5;
		for(int i=0; i<=tamanho; i++){
			//System.out.println("i vale = " + i);
			// if(i!=15){
				// texto +=i + ", ";
			// }else{
				// texto +=i;
			// }
			// if(i%2 == 0){
				// System.out.println("O numero " + i + " eh par");
			// }else{
				// System.out.println("O numero " + i + " eh impar");
			// }
			
			//vamos desenhar um quadrado
			for(int y=0; y<=tamanho; y++){
				System.out.print("+");
			}
			System.out.println();
		}
		//System.out.println(texto);
		
	}
}