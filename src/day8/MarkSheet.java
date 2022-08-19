package day8;

public class MarkSheet {

    public static void main(String[] args) {

       String name = "Dilisha Upadhyaya";
       int studentClass = 11;

       float math = 80;
       float physics = 75;
       float computer = 93;
       float chemistry = 80;
       float biology = 85;
       float nepali = 60;

       float percentage = ((math + physics + computer + chemistry + biology + nepali )/600)*100;
       System.out.println(percentage);

       boolean isDistinction = percentage >= 80;
       boolean isFirstDivision = percentage >= 70 && percentage < 80;
       boolean isSecondDivision = percentage >= 60 && percentage < 70;
       boolean isThirdDivision = percentage >= 50 && percentage <  60;
       boolean isFourthDivision = percentage >= 40 && percentage < 50;
       boolean isFail = percentage <= 40;

       System.out.println("Distinction : " + isDistinction);
       System.out.println("First Division : " + isFirstDivision);
       System.out.println("Second Division : " + isFirstDivision);
       System.out.println("Third Division : " + isThirdDivision);
       System.out.println("Fail : " + isFail);













    }
}
