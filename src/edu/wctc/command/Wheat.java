package edu.wctc.command;

/**
 * Class responsible for Wheat objects. Implements buy, sell, and getTotal from ICommodity
 * @author eplig
 * @version 1.0
 */
public class Wheat implements ICommodity {
    private double price = 10.00;
    private int quantity = 5;

    /**
     * Prints out product, price, quantity, and total of purchase
     */
    @Override
    public void buy(){
        System.out.println("Wheat [ Price: "+price+", Quantity: " + quantity +" ] bought. Total: " + (price * quantity));
    }

    /**
     * Prints out product, price, quantity, and total of sale
     */
    @Override
    public void sell(){
        System.out.println("Wheat [ Price: "+price+", Quantity: " + quantity +" ] sold. Total: " + (price * quantity));
    }

    /**
     * Multiplies price and quantity to get total. Returns total
     * @return Double: Total of purchase.
     */
    @Override
    public double getTotal() {
        return (price * quantity);
    }
}
