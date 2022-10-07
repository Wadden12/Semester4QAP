package src.com.testingqap1;

public class Grader {

    public  char returnLetterGrade(int grade){
        if(grade < 0){
            throw new IllegalArgumentException("Number grade cannot be zero");
        }else if(grade < 60){
            return 'F';
        } else if(grade < 70){
            return 'D';
        } else if(grade < 80){
            return 'C';
        } else if(grade <90){
            return'B';
        } else if(grade <=100){
            return 'A';
        } else{
            throw new IllegalArgumentException("Grade needs to be between 0-100, double check input and re-enter");
        }
    }
}
