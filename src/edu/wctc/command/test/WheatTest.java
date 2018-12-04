package edu.wctc.command.test;

import edu.wctc.command.Wheat;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class WheatTest extends TestCase {

    Wheat wheat = new Wheat();

    @Test
    public void testGetTotal() {
        assertEquals(50.0, wheat.getTotal());
    }
}