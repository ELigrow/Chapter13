package edu.wctc.command.test;

import edu.wctc.command.Beans;
import edu.wctc.command.BuyCommodity;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuyCommodityTest extends TestCase {


    Beans beans = new Beans();
    BuyCommodity buy = new BuyCommodity(beans);

    @Test
    public void getPrice() {
        assertEquals(79.95, buy.getPrice());
    }
}