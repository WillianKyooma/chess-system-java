package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
 
	
	
@Override 
public String toString() {
	return "R";
}

 

@Override
public boolean[][] possibleMoves() {
	boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; 
	
	Position p = new Position(0,0);
	
	//ABOVE
	p.setValues(position.getRow()-1, position.getColumn());
	while(getBoard().positionExists(p) && !getBoard().ThereIsAPiece(p)){
	  mat[p.getRow()][p.getColumn()]= true;	 
	  p.setRow(p.getRow()-1);
	}
	
	//BELOW
		p.setValues(position.getRow()+1, position.getColumn());
		while(getBoard().positionExists(p) && !getBoard().ThereIsAPiece(p)){
		  mat[p.getRow()][p.getColumn()]= true;	 
		  p.setRow(p.getRow()+1);
		}
	
	
	if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
		 mat[p.getRow()][p.getColumn()]= true;
	} 
	
	//LEFT
		p.setValues(position.getRow(), position.getColumn() - 1);
		while(getBoard().positionExists(p) && !getBoard().ThereIsAPiece(p)){
		  mat[p.getRow()][p.getColumn()]= true;	 
		  p.setColumn(p.getColumn()-1);
		}
		
		if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
			 mat[p.getRow()][p.getColumn()]= true;
		} 
		
		//RIGHT
				p.setValues(position.getRow(), position.getColumn() + 1);
				while(getBoard().positionExists(p) && !getBoard().ThereIsAPiece(p)){
				  mat[p.getRow()][p.getColumn()]= true;	 
				  p.setColumn(p.getColumn() + 1);
				}
				
				if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
					 mat[p.getRow()][p.getColumn()]= true;
				}
	
	return mat;
}
}
