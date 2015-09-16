import java.util.ArrayList;
import java.util.Scanner;

public class RepeticaoWhile{
	public static void main(String[] args){
		// int i = 0;
		// while(i<=10){
			// System.out.println((i!=10) ? "i = " + i + "; ": "i = " + i);
			// i++;
		// }
		// i = 0;
		// do{//executada 1 ou mais vezes
			// System.out.println(i);
			// i++;
		// }while(i < 2);
		
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos. Para sair, digite 'fim'.");
		
		String produto;
		produto = s.nextLine();
		while(!produto.equals("fim")){
			produtos.add(produto);
			produto = s.nextLine();
		}
		// for(String item : produtos){
			// System.out.println(item);
		// }
		System.out.println(produtos.toString());
	}
}