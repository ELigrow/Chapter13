package edu.wctc.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsible for Broker objects. Brokers hold on to a list of Orders, then execute the orders before deleting
 * them from their list
 * @author eplig
 * @version 1.0
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    private double grandTotal = 0.0;

    /**
     * Adds an order to a list to execute
     * @param order Order: Order to execute
     */
    public void takeOrder(Order order){
        orderList.add(order);
    }

    /**
     * Executes all orders on order list and prints out the grand total bought and sold
     */
    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
            grandTotal += order.getPrice();
        }
        orderList.clear();
        System.out.println("Total amount bought and sold: $" + grandTotal);
    }
}
