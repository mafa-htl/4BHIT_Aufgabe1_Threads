import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {

    private Date date;
    private int i = 1;
    private int limit;

    DatePrinter(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        while(i <= limit) {
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            this.date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));
            i++;
        }
    }

}
