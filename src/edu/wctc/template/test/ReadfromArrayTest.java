package edu.wctc.template.test;

import edu.wctc.template.ReadfromArray;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadfromArrayTest extends TestCase {


    ReadfromArray array = new ReadfromArray();

    @Test
    public void testIsInteractive() {
        assertTrue(array.isInteractive());
    }
}