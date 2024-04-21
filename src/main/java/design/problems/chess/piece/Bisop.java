package design.problems.chess.piece;

import design.problems.chess.Color;
import design.problems.chess.Coordinate;
import design.problems.chess.Move;

public class Bisop extends Piece{
    public Bisop(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Move move) {
        return false;
    }

    @Override
    public PieceType getPieceType() {
        return PieceType.BISOP;
    }
}
