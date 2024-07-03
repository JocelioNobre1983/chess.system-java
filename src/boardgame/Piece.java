package boardgame;

public class Piece {
	protected Position position;//protected para nao ficar visível na camada chess
	private Board board;
	
	/*passando apenas o board no construtor porque a posição de uma peça recem criada é iniciada
	como nula, pois ainda não foi colocada no tabuleiro*/
	public Piece(Board board) {
		this.board = board;
		this.position = null;//Pode ser sem a declaração, pois o java ja entende como null
	}

	protected Board getBoard() {/*devido a divisão por camadas, coloca como protected para 
	não ser acessado pela camada chess*/
		return board;
	}

}
