package edu.wctc.command.test;

import edu.wctc.command.BuyStock;
import edu.wctc.command.Stock;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuyStockTest extends TestCase {


    Stock stock = new Stock();
    BuyStock buy = new BuyStock(stock);

    @Test
    public void testGetPrice() {
        assertEquals(100.0, buy.getPrice());
    }
}