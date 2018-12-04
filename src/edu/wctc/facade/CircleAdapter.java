package edu.wctc.facade;

/**
 * Adapter for Circle objects, converting the 4 ints into coordinate pairs. Implements draw from Shape
 * @author eplig
 * @version 1.0
 */
public class CircleAdapter implements Shape{
    private Circle adaptee;

    /**
     * Creates a Circle object. Takes Circle object to create
     * @param circle Circle: Adaptee circle
     */
    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    /**
     * Draws a Circle object. Takes 4 ints as coordinates for the center and the farthest reach of the radius.
     * @param x1 Int: X coordinate of point 1 (Center)
     * @param y1 Int: Y coordinate of point 1 (Center)
     * @param x2 Int: X coordinate of point 2 (End of radius)
     * @param y2 Int: Y coordinate of point 2 (End of radius)
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
