package model;

import javax.swing.JOptionPane;

public class Loja {

	public static void main(String[] args) {
		
		String nome, autor;
		double preco;
		int faixas, minutos, op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					            "--- CADASTRO DOS PRODUTOS ---\n"
					            + "--- 1 CD \n"
					            + "--- 2 DVD \n"
					            + "--- 3 Livro \n"
					            + "--- 4 Finalizar"));
			
					if (op == 1) {
						
						nome = JOptionPane.showInputDialog("Nome do CD: ");
						preco = Double.parseDouble(JOptionPane.showInputDialog("Preco do CD: "));
					    faixas = Integer.parseInt(JOptionPane.showInputDialog("Faixas do CD: "));
					    
					    CD cd = new CD(nome, preco, faixas);
					    cd.Imprime();
						
					} else if (op == 2) {
						nome = JOptionPane.showInputDialog("Nome do filme: ");
						preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do filme: "));
						minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos de filme: "));
						
						DVD dvd = new DVD(nome, preco, minutos);
						dvd.Imprime();
						
					} else if (op == 3) {
						nome = JOptionPane.showInputDialog("Nome do Livro: ");
						autor = JOptionPane.showInputDialog("Nome do Autor: ");
						preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do Livro "));	
						
						Livro livro = new Livro(nome, preco, autor);
						livro.Imprime();
						
					} else if (op == 4) {
						JOptionPane.showMessageDialog(null, "Encerrando...");
						break;
						
					} else {
						JOptionPane.showMessageDialog(null, "Opção Invalida");
						
					}
					
					
							
					
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
