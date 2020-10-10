package joker.thread.ticket;

/**
 *  * 实例TicketRunable
 *  *
 *  * @version 1.0
 *  
 */
public class TicketRunable implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
            }
        }
    }

    public static void main(String[] args) {
        TicketRunable ticketRunable = new TicketRunable();
        Thread t1 = new Thread(ticketRunable);
        Thread t2 = new Thread(ticketRunable);
        Thread t3 = new Thread(ticketRunable);
        Thread t4 = new Thread(ticketRunable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
