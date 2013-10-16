package br.com.sudoku.jogo;

import br.com.sudoku.model.Posicao;
import br.com.sudoku.model.Grid;

public class Tabuleiro {

	public Tabuleiro montar(int quantidadeColunas, int quantidadeLinhas) {
		return this;
	}

	public int getTotalGrids() {
		return 9;
	}

	public Grid jogarNaGridDe(Posicao posicao) {
		return new Grid();
	}

	public Grid getGridNa(Posicao posicao) {
		return new Grid();
	}

}
