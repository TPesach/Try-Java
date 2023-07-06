public class Pawn extends Soldier{

    private String color;
    private int x;
    private int y;
    @Override
    public void validStep(int x, int y) {

    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
