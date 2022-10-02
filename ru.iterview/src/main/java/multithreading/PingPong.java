package multithreading;

public class PingPong {

    boolean flag = false;

    public synchronized void writePing() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ping");
        flag = false;
        notify();
    }

    public synchronized void writePong() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Pong");
        flag = true;
        notify();
    }

}
