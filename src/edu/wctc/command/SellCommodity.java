package edu.wctc.command;

/**
 * Responsible for sale of ICommodity objects. Implements execute and getPrice from Order
 * @author eplig
 * @version 1.0
 */
public class SellCommodity implements Order{
    ICommodity commodity;

    /**
     * Constructor for SellCommodity objects. Takes ICommodity to sell
     * @param iCommodity ICommodity: ICommodity object to sell
     */
    public SellCommodity(ICommodity iCommodity) {
        commodity = iCommodity;
    }

    /**
     * Executes an order, running its sell method
     */
    @Override
    public void execute() {
        commodity.sell();
    }

    /**
     * Gets the total price of the commodity order. Returns total price of sale
     * @return Double: Total price of sale
     */
    @Override
    public double getPrice() {
        return commodity.getTotal();
    }
}
