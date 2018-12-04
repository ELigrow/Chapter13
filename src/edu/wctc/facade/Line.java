package edu.wctc.facade;

/**
 * Creates Line objects. Implements draw from Shape
 * @author eplig
 * @version 1.0
 */
public class Line implements Shape{

    /**
     * Draws a Line object. Takes 4 ints as coordinates for both ends of the line.
     * @param x1 Int: X coordinate of point A
     * @param y1 Int: Y coordinate of point A
     * @param x2 Int: X coordinate of point B
     * @param y2 Int: Y coordinate of point B
     */
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}
