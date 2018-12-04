package edu.wctc.command;

/**
 * Interface for Order objects
 * @author eplig
 * @version 1.0
 */
public interface Order {
    void execute();
    double getPrice();
}