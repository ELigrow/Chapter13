package edu.wctc.facade;

public class SquareAdapter implements Shape{
    private Square adaptee;

    /**
     * Creates a Square object. Takes Square object to create
     * @param square Square: Adaptee square
     */
    public SquareAdapter(Square square) {
        this.adaptee = square;
    }

    /**
     * Calculates if object is truly a square, then draws a Rectangle object. Uses 4 ints to set the top-right
     * coordinate and bottom-left coordinate, then calculates the width and height. If width and height are not equal
     * prints "This is not a square."
     * @param x1 Int: X coordinate of top-right corner
     * @param y1 Int: Y coordinate of top-right corner
     * @param x2 Int: X coordinate of bottom-left corner
     * @param y2 Int: Y coordinate of bottom-left corner
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        boolean isSquare = false;
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        if (width == height){
            adaptee.draw(x, y, width, height);
        }else{
            System.out.print("This is not a square.");
        }

    }
}
