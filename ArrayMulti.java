import java.util.Random;

public class ArrayMulti{
	public static void main(String[] args){
		//String[] uma = {"Ricardo", "Andreas", "Evelyn"};
		//System.out.println(uma[1]);
		
		//matriz 2x3
		String[][] duas =
		{{"Andreas", "M", "MG"},{"Evelyn", "F", "MG"}};
		// System.out.println(duas[0][0]);
		// System.out.println(duas[0][1]);
		// System.out.println(duas[0][2]);
		// System.out.println(duas.length);
		// System.out.println(duas[0].length);//tamanho da primeira dimensao
		duas[0][2] = "SP";
		// System.out.println(duas[0][2]);
		
		int[][][][] arrayN; //pode ser criado com qualquer dimensao
		//-------------------------------------------
		//baralho lusófono
		Random r = new Random();
		
		String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		System.out.println(faces[r.nextInt(faces.length)] + " de " + nipes[r.nextInt(nipes.length)]);
	}
}