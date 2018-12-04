package edu.wctc.template;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Responsible for reading from files. Extends BookReader
 * @author eplig
 * @version 1.0
 */
public class ReadfromFile extends BookReader{
    private BufferedReader reader;

    /**
     * Creates the BufferedReader for reading from the file
     */
    @Override
    void initialize() {
        System.out.println("Open an input file");
        try {
            reader = new BufferedReader(new FileReader("prideprejudice"));
        }catch (Exception e){

        }
    }

    /**
     * Reads input from file
     */
    @Override
    void startReading() {
        System.out.println("Loop writing out each record");
        try {
            while (reader.readLine() != null) {
                System.out.println(reader.readLine());
            }
        }catch(Exception e){

        }
    }

    /**
     * Closes the file
     */
    @Override
    void stopReading() {
        System.out.println("Close input file");
        try {
            reader.close();
        }catch(Exception e){

        }
    }
}
