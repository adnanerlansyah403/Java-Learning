package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
        // https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html

//        Date tanggal = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date result = calendar.getTime();
        System.out.println(result);


    }

}
