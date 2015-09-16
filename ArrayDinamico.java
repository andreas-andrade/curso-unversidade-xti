import java.util.ArrayList;

public class ArrayDinamico{
	public static void main(String[] args){
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Branco");
		cores.add("Verde");
		cores.add(0, "Vermelho");
		cores.add("Amarelo");
		cores.add("Roxo");
		cores.add("Rosa");
		System.out.println(cores.toString());
		//System.out.println(cores.size()); devolve o tamanho do arraylist
		//System.out.println(cores.get(4));	 devolve o elemento na posição 4
		//devolve o indice do elemento: indexOf
		System.out.println("Indice= " + cores.indexOf("Azul"));	
		//remove o elemento
		cores.remove("Amarelo");
		//procurar um elemento dentro do arraylist
		System.out.println("Tem roxo? " + (cores.contains("Roxo") ? "tem" : "nao"));
		System.out.println("Tem purpura? " + (cores.contains("purpura") ? "tem" : "nao"));
	}
}