import java.util.Calendar;
import java.util.Date;

public class DateandCalendar {
    public static void main(String[] args) {
        /*
        di bawah ini adalah representasi waktu dengan date,pada Class date sudah banyak yang deprecated(ditinggal),maksudnya sudah tidak recomended.disarankan memakai Class Calendar
         */
        Date tanggal = new Date();
        System.out.println(tanggal);
        /*
        di bawah ini adalah mendapatkan date saat ini dengan menggunakan calendar.getInstance,lalu untuk mendapatkan waktu sekarang dengan getTime()
         */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        /*
        kit bisa mensetting data di Calendar
         */

        Calendar calendar1 =Calendar.getInstance();
        calendar1.set(Calendar.YEAR,2000);
        calendar1.set(Calendar.MONTH,11);
        calendar1.set(Calendar.DAY_OF_MONTH,30);
        calendar1.set(Calendar.HOUR_OF_DAY , 00);
        calendar1.set(Calendar.MINUTE,00);
        calendar1.set(Calendar.SECOND,00);

        Date kelahiran = calendar1.getTime();
        System.out.println("kamu lahir tahun : "+kelahiran);
    }
}
