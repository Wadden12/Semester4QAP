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

        MortgageCalculator mortgage = new MortgageCalculator(1_000_000, 5F, (byte) 30);
        Assertions.assertTrue(mortgage.calculateMortgage() > 0);

    }

    @Test

    public void testCalculatorMortgageToBeNotNull(){

        MortgageCalculator mortgage = new MortgageCalculator(1_000_000, 5F, (byte) 30);

        Assertions.assertNotNull(mortgage);

    }


}
