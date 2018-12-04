package edu.wctc.command;

/**
 * Responsible for purchase of Stock objects. Implements execute and getPrice from Order
 * @author eplig
 * @version 1.0
 */
public class BuyStock implements Order {
    private Stock abcStock;

    /**
     * Constructor for BuyStock objects. Takes Stock to purchase
     * @param abcStock Stock: Stock object to purchase
     */
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    /**
     * Executes an order, running its buy method
     */
    public void execute() {
        abcStock.buy();
    }

    /**
     * Gets the total price of the stock order. Returns total price of purchase
     * @return Double: Total price of purchase
     */
    @Override
    public double getPrice() {
        return abcStock.getTotal();
    }
}