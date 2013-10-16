package br.com.sudoku.jogo;


public class Sudoku {

	
	public Tabuleiro comGridsTamanho(final int quantidadeColunas, final int quantidadeLinhas) {
		return new Tabuleiro().montar(quantidadeColunas, quantidadeLinhas);
	}
	

}
