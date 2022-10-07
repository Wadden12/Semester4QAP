// Author: Mike Wadden
// date: October 3rd, 2022
// QAP1 Testing

package src.com.testingqap1;

public class Main {

    public static void main(String[] args){

        Calculator input1 = new Calculator(55,25.5);

        double addition = input1.addition();
        System.out.println("Sum: " + addition);

        double difference = input1.subtraction();
        System.out.println("Difference: " + difference);

        double product = input1.multiplication();
        System.out.println("Product: " + product);

        double division = 0;
        try {
            division = input1.division();
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Division " + division);

        Grader grader = new Grader();

        char grade = grader.returnLetterGrade(99);


        System.out.println(grade);

    }



}
