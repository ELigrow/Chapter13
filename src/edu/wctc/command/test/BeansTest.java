package edu.wctc.command.test;

import edu.wctc.command.Beans;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeansTest extends TestCase {

    Beans beans = new Beans();

    @Test
    public void testGetTotal() {
        assertEquals(79.95, beans.getTotal());
    }
}