package edu.wctc.template;

/**
 * Responsible for reading from Arrays. Extends BookReader
 * @author eplig
 * @version 1.0
 */
public class ReadfromArray extends BookReader{
    private Franky theBook;

    /**
     * Creates the array object from Franky
     */
    @Override
    void initialize() {
        theBook = new Franky();
    }

    /**
     * Reads the output of Franky
     */
    @Override
    void startReading() {
        theBook.outputBook();
    }

    /**
     * Returns true for isInteractive
     * @return Boolean: True value for isInteractive
     */
    @Override
    public boolean isInteractive() {
        return true;
    }

    /**
     * Not run because isInteractive = true
     */
    @Override
    void stopReading() {

    }
}