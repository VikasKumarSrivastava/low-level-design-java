package design.problems.chess.piece;

import design.problems.chess.Color;
import design.problems.chess.Coordinate;
import design.problems.chess.Move;

public class King extends Piece{
    public King(Color color, Coordinate initialCoordinate) {
        super(color, initialCoordinate);
    }

    @Override
    public boolean isValidMove(Move move) {
        return false;
    }

    @Override
    public PieceType getPieceType() {
        return PieceType.KING;
    }
}