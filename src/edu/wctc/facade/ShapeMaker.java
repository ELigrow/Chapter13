package edu.wctc.facade;

/**
 * Facade class for Shape processes.
 * @author eplig
 * @version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape line;

    /**
     * Constructor for ShapeMaker class. Creates a blank shape of each type.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        line = new Line();
    }

    /**
     * Draws a Line object. Takes 4 ints as coordinates for both ends of the line.
     * @param x1 Int: X coordinate of point A
     * @param y1 Int: Y coordinate of point A
     * @param x2 Int: X coordinate of point B
     * @param y2 Int: Y coordinate of point B
     */
    public void drawLine(int x1, int y1, int x2, int y2){
        line.draw(x1, y1, x2, y2);
    }

    /**
     * Draws a Circle object. Takes 4 ints as coordinates for the center and the farthest reach of the radius.
     * @param x1 Int: X coordinate of point 1 (Center)
     * @param y1 Int: Y coordinate of point 1 (Center)
     * @param x2 Int: X coordinate of point 2 (End of radius)
     * @param y2 Int: Y coordinate of point 2 (End of radius)
     */
    public void drawCircle(int x1, int y1, int x2, int y2){
        circle.draw(x1, y1, x2, y2);
    }

    /**
     * Draws a Rectangle object. Uses 4 ints to set the top-right coordinate and bottom-left coordinate,
     * then calculates the width and height.
     * @param x1 Int: X coordinate of top-right corner
     * @param y1 Int: Y coordinate of top-right corner
     * @param x2 Int: X coordinate of bottom-left corner
     * @param y2 Int: Y coordinate of bottom-left corner
     */
    public void drawRectangle(int x1, int y1, int x2, int y2){
        rectangle.draw(x1, y1, x2, y2);
    }

    public void drawSquare(int x1, int y1, int x2, int y2){
        square.draw(x1, y1, x2, y2);
    }
}
