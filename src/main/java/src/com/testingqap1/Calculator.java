package src.com.testingqap1;

public class Calculator {

    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        setNumber1(number1);
        setNumber2(number2);
    }


    private double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double addition(){
        return this.number1 + this.number2;
    }


    public double subtraction(){
        return this.number1 - number2;
    }

}
