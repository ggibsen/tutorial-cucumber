package ggibsen.tutorials;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ggibsen on 6/28/2017.
 */
public class JunitTest {

    @Test
    public void sillyTest() {
        assertEquals(2,17 % 5);
    }
}
