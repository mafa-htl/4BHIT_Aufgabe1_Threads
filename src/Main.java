public class Main {

    public static void main(String[] args) {

        DatePrinter dp = new DatePrinter(20);
        Thread th1 = new Thread(dp);

        CountPrinter cp = new CountPrinter(20);
        Thread th2 = new Thread(cp);

        th1.start();
        th2.start();

    }
}
