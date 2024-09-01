package controller;

public class ThreadMatriz extends Thread{
	private int[] linha;
	private int idLinha;

	public ThreadMatriz(int[] linha, int idLinha) {
		this.linha = linha;
		this.idLinha = idLinha;
	}
	
	@Override
	public void run() {
		int soma = 0;
		for(int numero : linha) {
			soma += numero;
		}
		
		System.out.println("Linha: " + idLinha + " Soma: " + soma);
	}
	
	public static void calcularSomaLinhas(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			ThreadMatriz threadMatriz = new ThreadMatriz(matriz[i], i + 1);
			threadMatriz.start();
		}
	}
}
