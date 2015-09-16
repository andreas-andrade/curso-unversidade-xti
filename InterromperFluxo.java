public class InterromperFluxo{
	public static void main(String[] args){
		
		primeiro_for: //é como se fosse o nome do for. serve para identificá-lo
		for(int i = 0; i<10;i++){
			System.out.println(i);
			if(i ==5){
				break;//para a execução do loop mais INTERNO
				//continue; //pula para o proximo indice do loop
				
			}
		}
		
		boolean[][] matrix =
		{
			{true, false, false, false, false},
			{false, false, false, false, false}
		};
		
		busca: //apelido do for
		for(int x = 0; x<matrix.length;x++){
			for(int y = 0; y<matrix[x].length;y++){
				if(matrix[x][y]){
					System.out.println("achou");
					break busca;
				}else System.out.println("lixo");
			}
		}
		
	}
}