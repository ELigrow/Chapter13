package edu.wctc.facade;

/**
 * Creates Circle objects. Implements draw from Shape
 * @author eplig
 * @version 1.0
 */
public class Circle implements Shape {

    /**
     * Draws a Circle object. Takes 4 ints as coordinates for the center and the farthest reach of the radius.
     * @param x1 Int: X coordinate of point 1 (Center)
     * @param y1 Int: Y coordinate of point 1 (Center)
     * @param x2 Int: X coordinate of point 2 (End of radius)
     * @param y2 Int: Y coordinate of point 2 (End of radius)
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Circle with its center at point A(" + x1 + ";" + y1 + ")," +
                " with its radius reaching to point B(" + x2 + ";" + y2 + ")");
    }
}