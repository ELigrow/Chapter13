package edu.wctc.template.test;

import edu.wctc.template.ReadfromUser;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadfromUserTest extends TestCase {


    ReadfromUser user = new ReadfromUser();

    @Test
    public void testIsInteractive() {
        assertTrue(user.isInteractive());
    }
}