import java.util.ArrayList;
public class RepeticaoAprimorado{
	public static void main(String[] args){
		
		int [] pares = {2,4,6,8,10};
		/*for tradicional*/
		// for(int i=0;i<pares.length; i++){
			// System.out.println(pares[i]);
		// }
		
		// /* foreach */
		// for(int par : pares){
			// System.out.println(par);
		// }
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10; i++){
			list.add(i);
		}
		int contador = 0;
		for(Integer numero : list){
			System.out.println(numero);
		}
	}
}