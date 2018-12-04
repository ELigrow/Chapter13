package edu.wctc.command.test;

import edu.wctc.command.Corn;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornTest extends TestCase {


    Corn corn = new Corn();

    @Test
    public void testGetTotal() {
        assertEquals(29.950000000000003, corn.getTotal());
    }
}