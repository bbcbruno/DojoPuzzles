package br.com.sudoku;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.sudoku.exception.ValorMaximoExcedido;
import br.com.sudoku.jogo.Sudoku;
import br.com.sudoku.model.Posicao;
import br.com.sudoku.model.Tabuleiro;

public class SudokuTest {

	@Test
	public void umTabuleiroDeTamanho3x3DeveConter9Grids() {
		
		Tabuleiro tabuleiro = new Sudoku().comGridsTamanho(3,3);
		
		assertNotNull(tabuleiro);
		assertEquals(9, tabuleiro.getTotalGrids());
	}

	@Test
	public void umGridNaGrade1x1NaPosicao1x1DeveGuardarOValorPassado8() {
		
		Tabuleiro tabuleiro = new Sudoku().comGridsTamanho(3,3);
		tabuleiro.jogarNaGridDe(new Posicao(1,1)).valor(8).para(new Posicao(1, 1));
		
		assertEquals(new Integer(8), tabuleiro.getGridNa(new Posicao(1, 1)).getValorNa(new Posicao(1, 1)));
	}
	
	@Test
	public void umGridNaGrade2x1NaPosicao1x1DeveGuardarOValorPassado5() {
		
		Tabuleiro tabuleiro = new Sudoku().comGridsTamanho(3,3);
		tabuleiro.jogarNaGridDe(new Posicao(2,1)).valor(5).para(new Posicao(1, 1));
		
		assertEquals(new Integer(5), tabuleiro.getGridNa(new Posicao(2, 1)).getValorNa(new Posicao(1, 1)));
	}

	@Test(expected=ValorMaximoExcedido.class)
	public void quandoJogarUmNumeroMaiorQueOMaximoPermitidoNoJogoDeveGerarExcecao() {
		
		Tabuleiro tabuleiro = new Sudoku().comGridsTamanho(3,3);
		tabuleiro.jogarNaGridDe(new Posicao(2,1)).valor(18).para(new Posicao(1, 1));
		
	}

}
