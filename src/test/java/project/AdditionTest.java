package project;

import junit.framework.TestCase;


public class AdditionTest extends TestCase{

    Addition add;

    public AdditionTest(){
        add = new Addition();
    }


    public void testAdd() {
        assertEquals(add.add(5,5),10);
    }

    public void testCheckGuess() {
        assertTrue(add.checkGuess(5,5,10));
    }
}