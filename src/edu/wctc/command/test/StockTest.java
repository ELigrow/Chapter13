package edu.wctc.command.test;

import edu.wctc.command.Stock;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest extends TestCase {

    Stock stock = new Stock();

    @Test
    public void testGetTotal() {
        assertEquals(100.0, stock.getTotal());
    }
}