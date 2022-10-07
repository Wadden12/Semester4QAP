package src.com.testingqap1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    // For a class like this i thought this may be better approach then inside each method
    Calculator test1 = new Calculator(2, 0);
    Calculator test2 = new Calculator(-2, 2.55);
    Calculator test3 = new Calculator(23, 5);


    @Test
    public void testSum() {

        Assertions.assertEquals(2, test1.addition());
        Assertions.assertNotEquals(2.01, test1.addition());

        //added a Delta since the test was failing because of a  small difference with decimal places
        // wanted to test edge case to make sure the test would still work
        Assertions.assertEquals(0.55, test2.addition(), 0.001);

        Assertions.assertEquals(28, test3.addition());

    }

    @Test
    public void testDifference() {

        Assertions.assertEquals(2, test1.subtraction());
        Assertions.assertEquals(-4.55, test2.subtraction(), 0.001);
        Assertions.assertEquals(18, test3.subtraction());
    }

    @Test
    public void testProduct() {

        Calculator test1 = new Calculator(2, 0);
        Calculator test2 = new Calculator(-2, 2.55);

        Calculator test3 = new Calculator(23, 5);

        Assertions.assertEquals(0, test1.multiplication());
        Assertions.assertNotEquals(2, test1.multiplication());
        Assertions.assertEquals(-5.1, test2.multiplication(), 0.001);
        Assertions.assertEquals(115, test3.multiplication(), 0.001);

    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(-0.78431373, test2.division(), 0.001);
        Assertions.assertEquals(4.6, test3.division());
    }


    @Test

    public void testInvalidZeroInputForDivisionToBeTrue() {
        boolean exceptionThrown = false;

        try {
            test1.division();
        } catch (IllegalArgumentException iae) {
            exceptionThrown = true;
        }

        Assertions.assertTrue(exceptionThrown);
    }

    @Test
    public void testInvalidZeroInputForDivisionToBeFalse() {
        boolean exceptionThrown = false;

        try {
            test2.division();
        } catch (IllegalArgumentException iae) {
            exceptionThrown = true;
        }

        Assertions.assertFalse(exceptionThrown);

    }
    @Test
    public void newDivideByZeroExceptionTest(){

       assertThrows(IllegalArgumentException.class, () ->{
           test1.division();
       });
    }

}




