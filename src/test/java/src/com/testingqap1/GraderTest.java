package src.com.testingqap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 // Grade Test has 100% Coverage
class GraderTest {

    // top edge case for F
    @Test
    public void fiftyNineShouldReturnF(){

        Grader grader = new Grader();

        assertEquals('F', grader.returnLetterGrade(59));
    }


    @Test

    // Bottom edge case for F

    public void zeroShouldReturnF(){
        Grader grader = new Grader();
        assertEquals('F', grader.returnLetterGrade(0));
    }
    // negavite entry check useing a lambda
    @Test
    public void negativeGradeExceptionThrowCheck(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, () ->{
            grader.returnLetterGrade(-25);
        });
    }

    // edge tests for D
    @Test
    public void sixtyShouldReturnD(){
        Grader grader = new Grader();
        assertEquals('D', grader.returnLetterGrade(60));
    }

        @Test
    public void sixtyNineShouldReturnD(){
            Grader grader = new Grader();
            assertEquals('D', grader.returnLetterGrade(69));
    }

     // Edge cases for C
    @Test
    public void seventyShouldReturnC(){
        Grader grader = new Grader();
        assertEquals('C', grader.returnLetterGrade(70));
    }

    @Test
    public void seventyNineShouldReturnC(){
        Grader grader = new Grader();
        assertEquals('C', grader.returnLetterGrade(79));
    }

    // edge cases B
    @Test
    public void eightyShouldReturnB(){
        Grader grader = new Grader();
        assertEquals('B', grader.returnLetterGrade(80));
    }

    @Test

    public void eightyNineShouldReturnB(){
        Grader grader = new Grader();
        assertEquals('B',grader.returnLetterGrade(89) );
    }

    // edge cases for A


    @Test

    public void ninetyShouldReturnA(){
        Grader grader = new Grader();
        assertEquals('A', grader.returnLetterGrade(90));
    }

    @Test
    public void oneHundredShouldReturnA(){
        Grader grader = new Grader();
        assertEquals('A', grader.returnLetterGrade(100));
    }

    // checks for the final exceptions
    @Test
    public void gradeHigherThanMaxException(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, ()->{
            grader.returnLetterGrade(101);
        });
    }

}