package day10;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
public class PreDefinedClass {

    public static void main(String[] args) {

     //   Math math = new Math();
        long roundValue = Math.round(5.40);
        System.out.println(roundValue);

       //  Math.ceil(5.40f);

        double ceiledValue = Math.ceil(5.000004);
        System.out.println(ceiledValue);

        double flooredValue = Math.floor(5.99999);
        System.out.println(flooredValue);

      double randomValue = Math.round(Math.random() *1000);
        System.out.println(randomValue);

        int maximum = Math.max(4000, 20);
        System.out.println(maximum);

        int minimum = Math.min(10 , 4000);
        System.out.println(minimum);

        // Date

       Date currentDate = new Date();
       System.out.println(currentDate);

     //  Calendar

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(Calendar.YEAR, 1994);
        birthCalendar.set(Calendar.MONTH, 11);
        birthCalendar.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println(calendar);
        System.out.println(birthCalendar.getTime());
        System.out.println(calendar);

        Calendar dueDate =  Calendar.getInstance();
        dueDate.set(Calendar.YEAR, 2022);
        dueDate.set(Calendar.MONTH, 10);
        dueDate.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println(dueDate.getTime());

        dueDate.add(Calendar.MONTH,1);

        System.out.println(dueDate.get(Calendar.YEAR));
        System.out.println(dueDate.get(Calendar.MONTH));
        System.out.println(dueDate.get(Calendar.DAY_OF_MONTH));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat simpleDateFormat = simpleDateFormat1;
        System.out.println(simpleDateFormat);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE/MMMM/HH");
        String formattedDate = simpleDateFormat.format(dueDate.getTime());
        System.out.println(formattedDate);


        Calendar Cal = Calendar.getInstance();

        






































    }
}
