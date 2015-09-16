import java.util.Arrays;

public class ArraySimples{
	public static void main(String[] args){
		// int[] impares = new int[5];
		// impares[0] = 1;
		// impares[1] = 3;
		// impares[2] = 5;
		// impares[3] = 7;
		// impares[4] = 9;
		
		// paises[2] = "Inglaterra";
		// System.out.println(paises[2]);
		// System.out.println(paises.length);
		String[] paises = {"Brasil", "Russia", "India", "China"};
		
		//transforma o array numa string
		System.out.println(Arrays.toString(paises));
		
		//pesquisar em arrays
		int pos;
		pos = Arrays.binarySearch(paises, "Russia");
		System.out.println(pos);
		
		//ordenaçao de array em ordem crescente
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		Double[] values = {1.35, 345.54, 78.78};
		System.out.println(values[0].doubleValue());
	}
}