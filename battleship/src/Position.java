/*
 Name: Le Huynh Nha Nguyen
 ID: ITDSIU21058
 Position class:
 It includes methods for manipulating positions, such as setting coordinates, adding and subtracting positions, calculating distances, and more.
 The class also provides unit vectors for common directions (up, down, left, right, zero).
*/


public class Position {
    /**
     * Down moving unit vector.
     */
    public static final Position DOWN = new Position(0,1);
    /**
     * Up moving unit vector.
     */
    public static final Position UP = new Position(0,-1);
    /**
     * Left moving unit vector.
     */
    public static final Position LEFT = new Position(-1,0);
    /**
     * Right moving unit vector.
     */
    public static final Position RIGHT = new Position(1,0);
    /**
     * Zero unit vector.
     */
    public static final Position ZERO = new Position(0,0);

    /**
     * X coordinate.
     */
    public int x;
    /**
     * Y coordinate.
     */
    public int y;

    /**
     * Sets the value of Position.
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy constructor to create a new Position using the values in another.
     */
    public Position(Position positionToCopy) {
        this.x = positionToCopy.x;
        this.y = positionToCopy.y;
    }

    /**
     * Sets the Position to the specified x and y coordinate.
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Updates this position by adding the values from the otherPosition.
     */
    public void add(Position otherPosition) {
        this.x += otherPosition.x;
        this.y += otherPosition.y;
    }

    /**
     * Calculate the distance from this position to the other position.
     */
    public double distanceTo(Position otherPosition) {
        return Math.sqrt(Math.pow(x-otherPosition.x,2)+Math.pow(y-otherPosition.y,2));
    }

    /**
     * Multiplies both components of the position by an amount.
     */
    public void multiply(int amount) {
        x *= amount;
        y *= amount;
    }

    public void subtract(Position otherPosition) {
        this.x -= otherPosition.x;
        this.y -= otherPosition.y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
