/*
  Name: Le Huynh Nha Nguyen
  ID: ITDSIU21058
  Game: Battleship
  Rectangle Class:
  A simple Rectangle with a position defined by the top left corner,
  and a width,height to represent the size of the Rectangle
 */
public class Rectangle {
    protected Position position;
    protected int width;
    protected int height;
/* The first constructor of the Rectangle */
    public Rectangle(Position position, int width, int height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height) {
        this(new Position(x,y), width, height);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Position getPosition() {
        return position;
    }
    public boolean isPositionInside(Position targetPosition) {
        return targetPosition.x >= position.x && targetPosition.y >= position.y && targetPosition.x < position.x + width && targetPosition.y < position.y + height;
    }
}
