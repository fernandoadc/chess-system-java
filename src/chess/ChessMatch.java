/*
 * Esta classe é responsável pelas regras do jogo (de uma nova partida)
 */

package chess;

import boardgame.Board;
import boardgame.Position;
import boardgame.Piece;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(Board board) {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        
        for(int i=0; i<board.getRows(); i++){
            for(int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        /* 
         * para cada posição no tabuleiro (Board)
         * passar a peça para ChessPiece na camada chess
        */
        return mat;
    }
    
    private void initialSetup(){
        /*
         * Responsavel por iniciar uma nova partida
         */
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
    }
}
