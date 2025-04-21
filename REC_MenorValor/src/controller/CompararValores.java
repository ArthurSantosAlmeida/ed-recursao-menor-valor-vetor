package controller;

public class CompararValores {
	
	public CompararValores() {
		super();
	}
	
	public int funcao (int v[], int tam, int men) {
		
		//Condicao de parada -> Se nao houver mais espaco no vetor a ser comparado
		if (tam == -1) {
			return men;
		}
		//Comparar o menor valor encontrado com a ultima posicao do vetor
		if (men>v[tam]) {
			men=v[tam];
		}
		
		//Chamar a mesma funcao com um tamanho menor de vetor
		return funcao(v, tam--, men);
		
	}
	
}
