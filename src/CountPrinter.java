/**class CountPrinter
 * @author Matteo Falkenberg
 * @version 1.2, 30.09.2021
 */

public class CountPrinter implements Runnable {

    private int i = 1;
    private int limit;

    CountPrinter(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        while(i <= limit) {
            System.out.println(i);
            i++;
        }
    }

}
