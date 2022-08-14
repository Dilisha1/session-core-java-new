package day3;

public class SimpleInterest {
    public static void main(String[] args) {

        float p = 2000;
        int t = 4;
        float r = 7;
        //   interest(p,t,r);

        float interest = interestAndReturn(p,t,r);
        System.out.println(interest);

        float p1 = 3000;
        int t1 = 5;
        float r1 = 4;

        //  interest1(p1,t1,r1);
        float interest1 = interestAndReturn(p1,t1,r1);
        System.out.println(interest1);


    }

    public static float interestAndReturn(float p, int t, float r) {
        float interest = (p * t * r)/100;
       return interest;
    }

    public static void interest(float p, int t, float r) {
        float interest = (p * t * r)/100;
        System.out.println(interest);
    }
}