public class TimeReader extends Thread{
    private Timer timer;

    public TimeReader(Timer timer){
        this.timer=timer;
    }

    @Override
    public void run() {
        while (true){
            int seconds = timer.getSeconds();
            System.out.println(timer.getStep()+" " + seconds);

        }
    }
}
