package day3;

public class Function {

    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        int c = 8;
      //  add(a, b, c);
       int add1 =  addAndReturn(a, b, c);
       System.out.println(add1);


        int d = 8;
        int e = 9;
        int f = 3;
       // add(d, e, f);
       int add2 = addAndReturn(d, e, f);
       System.out.println(add2);

        int g = 6;
        int h = 1;
        int i = 7;
        // add(g, h, i);
       int add3 = addAndReturn(g, h, i);
       System.out.println(add3);


    }
    public static int addAndReturn(int a, int b, int c){
        int add1 = a + b +c;
        return add1;

    }

    public static void add(int a, int b, int c){
        int add1 = a + b + c;
        System.out.println(add1);

    }





    }




