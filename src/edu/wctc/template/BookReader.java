package edu.wctc.template;

/**
 * Template class for BookReader objects.
 * @author eplig
 * @version 1.0
 */
public abstract class BookReader {

    /**
     * Responsible for the initializing of processes required for reading
     */
    abstract void initialize();

    /**
     * Reads the file
     */
    abstract void startReading();

    /**
     * Ends processes required for reading
     */
    abstract void stopReading();

    /**
     * Dictates the order in which the book is read
     */
    public final void readBook() {
        initialize();
        startReading();
        if(!isInteractive()) {
            stopReading();
        }
    }

    /**
     * Determines whether or not a book is interactive
     * @return Boolean: whether or not the book is interactive
     */
    protected boolean isInteractive(){
        return false;
    }
}
