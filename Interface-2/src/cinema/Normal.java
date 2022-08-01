package cinema;

import javax.swing.JOptionPane;

public class Normal extends Ingresso{

	
	public Normal(double preco) {
		super();
	}
		
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso Normal \n" + "Valor: R$" + this.getValor());
	}



}
