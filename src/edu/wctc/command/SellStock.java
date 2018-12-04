package edu.wctc.command;

/**
 * Responsible for sale of Stock objects. Implements execute and getPrice from Order
 * @author eplig
 * @version 1.0
 */
public class SellStock implements Order {
    private Stock abcStock;

    /**
     * Constructor for SellStock objects. Takes Stock to sale
     * @param abcStock Stock: Stock object to sale
     */
    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    /**
     * Executes an order, running its buy method
     */
    public void execute() {
        abcStock.sell();
    }

    /**
     * Gets the total price of the stock order. Returns total price of sale
     * @return Double: Total price of sale
     */
    @Override
    public double getPrice() {
        return abcStock.getTotal();
    }
}
