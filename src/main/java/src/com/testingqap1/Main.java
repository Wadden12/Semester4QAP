// Author: Mike Wadden
// date: October 3rd, 2022
// QAP1 Testing

package src.com.testingqap1;

public class Main {

    public static void main(String[] args){

        Calculator input1 = new Calculator(55,25.5);

        double addition = input1.addition();
        System.out.println(addition);

    }
}
