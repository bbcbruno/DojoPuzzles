package br.com.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.sudoku.jogo.Sudoku;
import br.com.sudoku.jogo.Tabuleiro;
import br.com.sudoku.model.Posicao;
import br.com.sudoku.model.Grid;

public class SudokuTest {

	@Test
	public void criarUmNovoJogoComGridsDeTamanho3x3() {
		Tabuleiro tabuleiro = new Sudoku().comGridsTamanho(3,3);
		assertNotNull(tabuleiro);
		assertEquals(9, tabuleiro.getTotalGrids());
	}

	@Test
	public void jogarNaGrade1x1oValor8NaPosicao1x1() {
		Tabuleiro tabuleiro = new Sudoku().comGridsTamanho(3,3);
		Grid grid = tabuleiro.jogarNaGridDe(new Posicao(1,1)).valor(8).para(new Posicao(1, 1));
		assertEquals(8, grid.getValorNa(new Posicao(1, 1)));
		assertEquals(8, tabuleiro.getGridNa(new Posicao(1, 1)).getValorNa(new Posicao(1, 1)));
	}
	
	@Test
	public void jogarNaGrade2x1oValor5NaPosicao1x1() {
		Tabuleiro tabuleiro = new Sudoku().comGridsTamanho(3,3);
		Grid grid = tabuleiro.jogarNaGridDe(new Posicao(2,1)).valor(5).para(new Posicao(1, 1));
		assertEquals(5, grid.getValorNa(new Posicao(2, 1)));
		assertEquals(5, tabuleiro.getGridNa(new Posicao(2, 1)).getValorNa(new Posicao(1, 1)));
	}

}
