package view;

import java.util.Random;

import controller.ThreadMatriz;

public class Principal {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		Random random = new Random();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(100);
			}
		}
		
		ThreadMatriz.calcularSomaLinhas(matriz);
	}
}
