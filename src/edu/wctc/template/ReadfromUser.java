package edu.wctc.template;

import java.util.Scanner;

/**
 * Responsible for reading user input
 * @author eplig
 * @version 1.0
 */
public class ReadfromUser extends BookReader {
    private String text;
    private Scanner keyboard = new Scanner(System.in);

    /**
     * Prompts user to type
     */
    @Override
    void initialize() {
        System.out.println("Enter some text to read.");
        text = keyboard.nextLine();
    }

    /**
     * Reads string
     */
    @Override
    void startReading() {
        System.out.println("Your string value was: " + text);
    }

    /**
     * Returns true for isInteractive
     * @return Boolean: isInteractive = true
     */
    @Override
    public boolean isInteractive() {
        return true;
    }

    /**
     * Not run since isInteractive = true
     */
    @Override
    void stopReading() {

    }
}
