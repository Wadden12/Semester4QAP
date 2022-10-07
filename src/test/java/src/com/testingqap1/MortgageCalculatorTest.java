package src.com.testingqap1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MortgageCalculatorTest {
    @Test
    public  void testCalculateMortgageFormulaForCorrectAnswer(){

        // test that the formula is working

        MortgageCalculator mortgage = new MortgageCalculator(10_000, 10F, (byte) 15);

         Assertions.assertEquals(107.46, mortgage.calculateMortgage(), 0.001);

    }


    @Test

    public void testCalculatorMortgageToBeGreaterThanZero(){

        // this check is also part of the validation process since this value should never be less than 0
        // then input validation is created after this test failed.

        MortgageCalculator mortgage = new MortgageCalculator(1_000_000, 5F, (byte) 30);
        Assertions.assertTrue(mortgage.calculateMortgage() > 0);

    }

    @Test

    public void testCalculatorMortgageToBeNotNull(){

        // in theory this check is meant to prove that the input could be null and needs to be handled in the validation
        // this would fail in the error check and i would go back in a add a exception so it does not crash the program

        MortgageCalculator mortgage = new MortgageCalculator(1_000_000, 5F, (byte) 30);

        Assertions.assertNotNull(mortgage);

    }

    @Test
    public void testCalculateBalanceFormula(){

        // test the Balance Formula

        MortgageCalculator mortgage1 = new MortgageCalculator(10_000_000, 4F, (byte) 25);

        Assertions.assertEquals(9902097.683, mortgage1.calculateBalance((short) 5), 0.001);


    }



}
