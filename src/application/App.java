/*
 * A classe principal do Projeto é responsável 
 * por executar todo o Jogo e suas dependências
 * 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
 */

package application;

import boardgame.Position;
import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        ChessMatch chess = new ChessMatch(null);
        UI.printBoard(chess.getPieces());
    }
}
