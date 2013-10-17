package br.com.sudoku.model;

import java.util.HashMap;
import java.util.Map;

public class Grid {

	private int valor;
	private Map<Posicao, Integer> valores = new HashMap<Posicao, Integer>();
	
	public Grid valor(int valor) {
		this.valor = valor;
		return this;
	}
	
	public void para(Posicao posicao) {
		if (valor > 0) {
			valores.put(posicao, new Integer(valor));
			valor = 0;
		}
	}

	public Integer getValorNa(Posicao posicao) {
		return valores.get(posicao);
	}

}
