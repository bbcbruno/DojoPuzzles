package br.com.sudoku.exception;

public class ValorMaximoExcedido extends RuntimeException {

	private static final long serialVersionUID = 4637736281986774091L;
	
	@Override
	public String getMessage() {
		return "Valor jogado nao pode exceder o maximo permitido";
	}
}
