package questions.TicTacToe;

public class Player {
    String name;
    PlayingPiece piece;
    public Player(String name, PlayingPiece piece){
        this.name = name;
        this.piece = piece;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPlayingPiece(PlayingPiece piece){
        this.piece = piece;
    }
    public String getName(){
        return this.name;
    }

    public PlayingPiece getPiece() {
        return this.piece;
    }
}
