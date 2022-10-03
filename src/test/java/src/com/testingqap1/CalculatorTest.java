package src.com.testingqap1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    Calculator test1 = new Calculator(2,0);
    Calculator test2 = new Calculator(-2, 2.55);

    Calculator test3 = new Calculator(23, 5);

    @Test
    public void testSum(){


        Assertions.assertEquals(2, test1.addition());
        Assertions.assertNotEquals( 2.01, test1.addition());

        //added a Delta since the test was failing because of a  small difference with decimal places
        // wanted to test edge case to make sure the test would still work
        Assertions.assertEquals(0.55, test2.addition(),0.001);

        Assertions.assertEquals(28, test3.addition());

    }
    @Test
    public void testDifference(){

        Assertions.assertEquals(2, test1.subtraction());
        Assertions.assertEquals(-4.55, test2.subtraction(),0.001);


    }



}



