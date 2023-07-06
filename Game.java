public class Game {
    private Square[][] gameBoard;
    private Soldier[] whiteSoldiers;
    private Soldier[] blacksoldiers;

    public Game(){

    }
    public Square[][] getGameBoard() {
        return gameBoard;
    }

    public Soldier[] getWhiteSoldiers() {
        return whiteSoldiers;
    }

    public Soldier[] getBlacksoldiers() {
        return blacksoldiers;
    }

    private void setGameBoard(Square[] gameBoard) {
        this.gameBoard = new Square[8][8];
    }

    private void setWhiteSoldiers(Soldier[] whiteSoldiers) {
        this.whiteSoldiers = new Soldier[16];
    }

    private void setBlacksoldiers(Soldier[] blacksoldiers) {
        this.blacksoldiers = new Soldier[16];
    }
}
