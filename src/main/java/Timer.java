public class Timer extends Thread {
    private final int step;
    private int seconds;

    public Timer(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    public synchronized int getSeconds() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return seconds;
    }

    public synchronized void setSeconds(int seconds) {
        this.seconds = seconds;
        notifyAll();
    }

    @Override
    public void run() {
        int millis = step * 1000;
        while (true) {
            try {
                sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setSeconds(seconds + 1);
        }
    }
}
