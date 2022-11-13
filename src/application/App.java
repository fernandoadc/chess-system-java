package application;

import boardgame.Position;
import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        /* GIT-TOKEN: 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 */
        ChessMatch chess = new ChessMatch(null);
        UI.printBoard(chess.getPieces());
    }
}
