/*
 * Trabalhando com JOptionPane
 * @author: Andreas Andrade Adelino
 */
import javax.swing.JOptionPane;

public class Jpane{
	public static void main(String args[]){
	String nome = JOptionPane.showInputDialog("Qual o seu nome");
	JOptionPane.showMessageDialog(null, nome);
	//System.out.println(nome);
	}
}