package base;
import java.util.Calendar;
public class temp {public static void main(String[] args) {
    //create Calendar instance
    Calendar now = Calendar.getInstance();

    System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1)
            + "-"
            + now.get(Calendar.DATE)
            + "-"
            + now.get(Calendar.YEAR));


    //add year to current date using Calendar.add method
    now.add(Calendar.YEAR,1);

    System.out.println("date after one year : " + (now.get(Calendar.MONTH) + 1)
            + "-"
            + now.get(Calendar.DATE)
            + "-"
            + now.get(Calendar.YEAR));

    //substract year from current date
    now =Calendar.getInstance();
    now.add(Calendar.YEAR,-100);
    System.out.println("date before 100 years : " + (now.get(Calendar.MONTH) + 1)
            + "-"
            + now.get(Calendar.DATE)
            + "-"
            + now.get(Calendar.YEAR));

}
}

