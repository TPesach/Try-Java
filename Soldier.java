public abstract class Soldier {
    private String color;
    private int x;
    private int y;
    public abstract void validStep(int x,int y);

    public abstract String getColor();

    public abstract int getX();

    public abstract int getY();

    public abstract void setColor(String color);
    public abstract void setX(int x);

    public abstract void setY(int y);
}
