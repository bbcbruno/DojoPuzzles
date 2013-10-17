package br.com.sudoku.jogo;

import java.util.HashMap;
import java.util.Map;

import br.com.sudoku.model.Posicao;
import br.com.sudoku.model.Grid;

public class Tabuleiro {

	private Map<Posicao, Grid> grids = new HashMap<Posicao, Grid>();
	
	public Tabuleiro montar(int quantidadeColunas, int quantidadeLinhas) {
		
		for(int coluna = 1; coluna <= quantidadeColunas; coluna++) {
			for(int linha = 1; linha <= quantidadeColunas; linha++) {
				grids.put(new Posicao(coluna, linha), new Grid());
			}		
		}
		return this;
	}

	public int getTotalGrids() {
		return grids.size();
	}

	public Grid jogarNaGridDe(Posicao posicao) {
		return grids.get(posicao);
	}

	public Grid getGridNa(Posicao posicao) {
		return grids.get(posicao);
	}

}
