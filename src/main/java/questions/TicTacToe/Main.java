package questions.TicTacToe;

public class Main {
    public static void main(String [] args){
         TicTacToeGame game = new TicTacToeGame();
         game.initialiseGame();
        System.out.println("game winner is: " + game.startGame());



    }
}
