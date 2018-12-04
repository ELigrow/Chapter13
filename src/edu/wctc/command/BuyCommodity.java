package edu.wctc.command;

/**
 * Responsible for purchase of ICommodity objects. Implements execute and getPrice from Order
 * @author eplig
 * @version 1.0
 */
public class BuyCommodity implements Order{
    ICommodity commodity;

    /**
     * Constructor for BuyCommodity objects. Takes ICommodity to purchase
     * @param iCommodity ICommodity: ICommodity object to purchase
     */
    public BuyCommodity(ICommodity iCommodity) {
        commodity = iCommodity;
    }

    /**
     * Executes an order, running its buy method
     */
    @Override
    public void execute() {
        commodity.buy();
    }

    /**
     * Gets the total price of the commodity order. Returns total price of purchase
     * @return Double: Total price of purchase
     */
    @Override
    public double getPrice() {
        return commodity.getTotal();
    }
}
