package edu.wctc.command.test;

import edu.wctc.command.Beans;
import edu.wctc.command.SellCommodity;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellCommodityTest extends TestCase {


    Beans beans = new Beans();
    SellCommodity sell = new SellCommodity(beans);

    @Test
    public void testGetPrice() {
        assertEquals(79.95, sell.getPrice());
    }
}