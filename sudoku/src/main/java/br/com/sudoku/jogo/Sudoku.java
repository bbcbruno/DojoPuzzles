package br.com.sudoku.jogo;

import br.com.sudoku.model.Tabuleiro;


public class Sudoku {

	
	public Tabuleiro comGridsTamanho(final int quantidadeColunas, final int quantidadeLinhas) {
		return new Tabuleiro().montar(quantidadeColunas, quantidadeLinhas);
	}
	

}
