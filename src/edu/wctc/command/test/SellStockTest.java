package edu.wctc.command.test;

import edu.wctc.command.SellStock;
import edu.wctc.command.Stock;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellStockTest extends TestCase {

    Stock stock = new Stock();
    SellStock sell = new SellStock(stock);


    @Test
    public void testGetPrice() {
        assertEquals(100.0, sell.getPrice());
    }
}