package edu.wctc.facade;

/**
 * Creates Rectangle objects. Implements draw from Shape
 * @author eplig
 * @version 1.0
 */
public class Rectangle implements Shape {

    /**
     * Draws a Rectangle object. Uses 4 ints to set the top-right coordinate, width, and height.
     * @param x Int: X coordinate of top-right corner
     * @param y Int: Y coordinate of top-right corner
     * @param width Int: Width of Rectangle
     * @param height Int: Height of Rectangle
     */
    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}
