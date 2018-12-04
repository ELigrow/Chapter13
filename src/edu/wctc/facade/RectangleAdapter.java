package edu.wctc.facade;

/**
 * Adapter for Rectangle objects, converting the 4 ints into a coordinate pair, width, and height.
 * Implements draw from Shape
 * @author eplig
 * @version 1.0
 */
public class RectangleAdapter implements Shape {
    private Rectangle adaptee;

    /**
     * Creates a Rectangle object. Takes Rectangle object to create
     * @param rectangle Rectangle: Adaptee rectangle
     */
    public RectangleAdapter(Rectangle rectangle) {
        this.adaptee = rectangle;
    }

    /**
     * Draws a Rectangle object. Uses 4 ints to set the top-right coordinate and bottom-left coordinate,
     * then calculates the width and height.
     * @param x1 Int: X coordinate of top-right corner
     * @param y1 Int: Y coordinate of top-right corner
     * @param x2 Int: X coordinate of bottom-left corner
     * @param y2 Int: Y coordinate of bottom-left corner
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        adaptee.draw(x, y, width, height);
    }
}
