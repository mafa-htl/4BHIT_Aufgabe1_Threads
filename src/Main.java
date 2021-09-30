/**class Main
 * @author Matteo Falkenberg
 * @version 1.2, 30.09.2021
 */

/*
 Was fällt auf?
    Es wird erst bei einer großen Anzahl an Operationen parallel ausgeführt. Beim testen bis limit = 20000 wurde es bei
    mir nacheinander (seriell) verarbeitet.

 Versuche das Phänomen zu erklären!
    Es könnte daran liegen, dass die Performance bei wenig Operationen seriell und bei vielen Operationen
    parallel besser ist.

 Ändere nun dein Programm, sodass jeweils mehr Ausgaben je Thread erfolgen (200, 2000, 20000, ...).
 Was beobachtest du dabei?
    siehe Zeile 8-9 (Es wird erst ...)

 */

public class Main {

    public static void main(String[] args) {

        int limit = 200000;

        DatePrinter dp = new DatePrinter(limit);
        Thread th1 = new Thread(dp);

        CountPrinter cp = new CountPrinter(limit);
        Thread th2 = new Thread(cp);

        th1.start();
        th2.start();

    }
}
