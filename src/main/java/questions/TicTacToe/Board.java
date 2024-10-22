package questions.TicTacToe;

import com.sun.tools.javac.util.Pair;

import java.util.List;
import java.util.ArrayList;


public class Board {
    public int size;
    public PlayingPiece[][] board;

    Board(int size){
        this.size=size;
        this.board = new PlayingPiece[size][size];
    }
    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(board[row][column]!=null)
            return false;
        board[row][column]=playingPiece;
        return true;

    }
    public List<Pair<Integer,Integer>> getFreeCells() {

        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }
        return freeCells;

    }
    public void printBoard(){
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                if(board[i][j]!=null){
                    System.out.println(board[i][j].name + " ");
                }
                else{
                    System.out.println("  ");
                }
            }
            System.out.println("|");
        }
        System.out.println("\n");

    }
}
