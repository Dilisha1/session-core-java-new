package day9;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Dilisha";

      //  "Dilisha".lenght();
        String name1 = "Dilisha";

        boolean isInSameMemoryLocation = name == name1;  //never use == in equity test in object

        System.out.println(isInSameMemoryLocation);

        boolean isInSameMemoryLocation1 = name.equals(name1);  //always use .equals method for equity check in objects

        System.out.println(isInSameMemoryLocation1);





    }





}
