package questions.TicTacToe;


import com.sun.tools.javac.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initialiseGame() {
        players = new LinkedList<>();
        PlayingPiece pieceX = new PieceX();
        PlayingPiece pieceO = new PieceO();
        Player player1 = new Player("player1", pieceX);
        Player player2 = new Player("player2", pieceO);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);

    }

    public String startGame() {
        boolean isthereawinner = false;
        while (!isthereawinner) {
            Player playerTurn = players.removeFirst();
            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                isthereawinner = true;
                continue;
            }
            System.out.println("Player: " + playerTurn + " Enter row and column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.piece);
            if (!pieceAddedSuccessfully) {
                System.out.println("Incorrect place choosen. Try again");
                players.add(playerTurn);
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.piece);
            if (winner) {
                return playerTurn.name;
            }


        }
        return "tie";

    }
    public boolean isThereWinner(int row, int column, PlayingPiece pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i] != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column] != pieceType) {
                columnMatch = false;
            }
        }
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j] != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j] != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}


