package br.com.sudoku.model;

import java.util.HashMap;
import java.util.Map;

import br.com.sudoku.exception.ValorMaximoExcedido;

public class Grid {

	private int valor;
	private int maximoPermitido;

	private Map<Posicao, Integer> valores = new HashMap<Posicao, Integer>();
	
	public Grid(int maximoPermitido) {
		this.maximoPermitido = maximoPermitido;
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
		
		public ValorSemPosicao(int valor) {
			Grid.this.valor = valor;
		}

		public Grid para(Posicao posicao) {
			if (valor > 0) {
				valores.put(posicao, new Integer(valor));
				valor = 0;
			}
			return Grid.this;
		}
		
	}

}
