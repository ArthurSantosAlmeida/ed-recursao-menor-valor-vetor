package view;

import javax.swing.JOptionPane;
import controller.CompararController;

public class PrincipalView {
	public static void main(String[] args) {
		CompararController c = new CompararController();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		int v[] = new int [n];
		
		for (int i=0;i<n;i++) {
			v[n]= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao "+i));
		}
		
		System.out.print(c.funcao(v, n--, v[n-1]));
	}

}
