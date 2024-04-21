package design.problems.chess;

import design.problems.chess.piece.*;
import design.problems.chess.player.Player;

public class Board {
    public static final int BOARD_SIZE = 8;
    private Cell[][] board;


    /*
        | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
        ---------------------------------
     0  | A | A | A | A | A | A | A | A |
        ---------------------------------
     1  | A | A | A | A | A | A | A | A |
        ---------------------------------
     2  |   |   |   |   |   |   |   |   |
        ---------------------------------
     3  |   |   |   |   |   |   |   |   |
        ---------------------------------
     4  |   |   |   |   |   |   |   |   |
        ---------------------------------
     5  |   |   |   |   |   |   |   |   |
        ---------------------------------
     6  | B | B | B | B | B | B | B | B |
        ---------------------------------
     7  | B | B | B | B | B | B | B | B |
        ---------------------------------
     */
    public Board(Player a, Player b) {
        board = new Cell[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; ++i) {
            for (int j = 0; j < BOARD_SIZE; ++j) {
                board[i][j] = new Cell();
            }
        }

        for (int i = 0; i < BOARD_SIZE; ++i) {
            board[1][i] = new Cell(new Pawn(a.getColor()));
            board[6][i] = new Cell(new Pawn(b.getColor()));
        }

        // initialize pawns
        board[0][0] = new Cell(new Rook(a.getColor()));
        board[0][7] = new Cell(new Rook(a.getColor()));
        board[7][0] = new Cell(new Rook(b.getColor()));
        board[7][7] = new Cell(new Rook(b.getColor()));

        // initialize knights
        board[0][1] = new Cell(new Knight(a.getColor()));
        board[0][6] = new Cell(new Knight(a.getColor()));
        board[7][1] = new Cell(new Knight(b.getColor()));
        board[7][6] = new Cell(new Knight(b.getColor()));

        // initialize bisops
        board[0][2] = new Cell(new Bisop(a.getColor()));
        board[0][5] = new Cell(new Bisop(a.getColor()));
        board[7][2] = new Cell(new Bisop(b.getColor()));
        board[7][5] = new Cell(new Bisop(b.getColor()));

        // initialize queens
        board[0][3] = new Cell(new Queen(a.getColor()));
        board[0][4] = new Cell(new King(a.getColor()));

        // initialize kings
        board[7][3] = new Cell(new Queen(b.getColor()));
        board[7][4] = new Cell(new King(b.getColor()));
    }

    public Cell getCell(Coordinate coordinate) {
        if (coordinate.getX() < 0 || coordinate.getX() >= BOARD_SIZE
                || coordinate.getY() < 0 || coordinate.getY() >= BOARD_SIZE) {
            return null;
        }
        return this.board[coordinate.getX()][coordinate.getY()];
    }

    public void setCell(Coordinate coordinate, Piece piece) {
        board[coordinate.getX()][coordinate.getY()].setPiece(piece);
    }

    public void print() {
        for (int i = 0; i < BOARD_SIZE; ++i) {
            for (int j = 0; j < BOARD_SIZE; ++j) {
                if (board[i][j].isFree()) {
                    // let's make sure length of each name here be 12 characters.
                    System.out.print(rightPadding("Empty"));
                } else {
                    System.out.print(rightPadding(
                            board[i][j].getPiece().getPieceType().name() + "-" +
                                    board[i][j].getPiece().getColor().name()
                    ));
                }

            }
            System.out.println();
        }
    }

    private String rightPadding(String s) {
        // make string length of 15.
        return s + " ".repeat(15 - s.length());
    }
}
