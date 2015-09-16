import javax.swing.JOptionPane;
/**
 *Objetivo da classe: Calcular o IMC (índice de massa
 *corporal)
 *IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 */


public class IMC{
	public static void main(String args[]){
		System.out.println("IMC");
		String peso = JOptionPane.showInputDialog("Qual o seu peso em quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura em metros?");
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		//System.out.println("IMC = " + imc);
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Peso fora do normal";
		msg = "IMC = " + imc + "\n" + msg;
		//System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg);
	}
}