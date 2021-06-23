import java.util.Calendar;

public class SevenDays {
    Calendar cal = Calendar.getInstance();

    public boolean isSunday(int year, int month, int date) {
        month -= 1;
        cal.set(year, month, date);

        //シンプルにできる
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        } else {
            return false;
        }
    }
}
