package edu.wctc.facade;

/**
 * Adapter for Line objects, converting the 4 ints into coordinate pairs. Implements draw from Shape
 * @author eplig
 * @version 1.0
 */
public class LineAdapter implements Shape {
    private Line adaptee;

    /**
     * Creates a Line object. Takes Line object to create
     * @param line Line: Adaptee line
     */
    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    /**
     * Draws a Line object. Takes 4 ints as coordinates for both ends of the line.
     * @param x1 Int: X coordinate of point A
     * @param y1 Int: Y coordinate of point A
     * @param x2 Int: X coordinate of point B
     * @param y2 Int: Y coordinate of point B
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
