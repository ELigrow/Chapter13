package edu.wctc.facade;

public class Square implements Shape {

    /**
     * Draws a Rectangle object. Uses 4 ints to set the top-right coordinate, width, and height.
     * @param x1 Int: X coordinate of top-right corner
     * @param y1 Int: Y coordinate of top-right corner
     * @param x2 Int: Width of Square
     * @param y2 Int: Height of Square
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Square with coordinate left-down point (" + x1 + ";" + y1 + "), width: " + x2
            + " Height: " + y2);
    }
}
