package edu.wctc.command;

/**
 * Class responsible for Beans objects. Implements buy, sell, and getTotal from ICommodity
 * @author eplig
 * @version 1.0
 */
public class Beans implements ICommodity {
    private double price = 15.99;
    private int quantity = 5;

    /**
     * Prints out product, price, quantity, and total of purchase
     */
    @Override
    public void buy(){
        System.out.println("Beans [ Price: "+price+", Quantity: " + quantity +" ] bought. Total: " + getTotal());
    }

    /**
     * Prints out product, price, quantity, and total of sale
     */
    @Override
    public void sell(){
        System.out.println("Beans [ Price: "+price+", Quantity: " + quantity +" ] sold. Total: " + getTotal());
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
