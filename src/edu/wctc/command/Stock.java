package edu.wctc.command;

/**
 * Class responsible for Stock objects.
 * @author eplig
 * @version 1.0
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;
    private double price = 10.0;

    /**
     * Prints out product, price, quantity, and total of purchase
     */
    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    /**
     * Prints out product, price, quantity, and total of sale
     */
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

    /**
     * Multiplies price and quantity to get total. Returns total
     * @return Double: Total of purchase.
     */
    public double getTotal() {
        return (price * quantity);
    }
}
