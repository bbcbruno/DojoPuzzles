package br.com.sudoku.model;

import java.util.HashMap;
import java.util.Map;

import br.com.sudoku.exception.ValorMaximoExcedido;

public class Grid {

	private int maximoPermitido;

	private Map<Posicao, Integer> valores = new HashMap<Posicao, Integer>();
	
	public Grid(int quantidadeLinhas, int quantidadeColunas) {
		this.maximoPermitido = quantidadeLinhas * quantidadeColunas;
		for(int linha = 1; linha <= quantidadeLinhas; linha++) {
			for(int coluna = 1; coluna <= quantidadeColunas; coluna++) {
				valores.put(new Posicao(linha, coluna), 0);
			}		
		}
	}

	public ValorSemPosicao valor(int valor) {
		if (valor < 1 || valor > maximoPermitido) {
			throw new ValorMaximoExcedido();
		}
		return new ValorSemPosicao(valor);
	}
	

	public Integer getValorNa(Posicao posicao) {
		return valores.get(posicao);
	}
	
	public class ValorSemPosicao {
		
		private int valor;

		public ValorSemPosicao(int valor) {
			this.valor = valor;
		}

		public Grid para(Posicao posicao) {
			valores.put(posicao, valor);
			return Grid.this;
		}
		
	}

}
