package br.com.sudoku.model;

import java.util.HashMap;
import java.util.Map;

public class Tabuleiro {

	private Map<Posicao, Grid> grids = new HashMap<Posicao, Grid>();
	
	public Tabuleiro montar(int quantidadeLinhas, int quantidadeColunas) {
		for(int linha = 1; linha <= quantidadeLinhas; linha++) {
			for(int coluna = 1; coluna <= quantidadeColunas; coluna++) {
				grids.put(new Posicao(linha, coluna), new Grid(quantidadeLinhas, quantidadeColunas));
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
