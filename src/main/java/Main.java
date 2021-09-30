public class Main {
    public static void main(String[] args) {


        Timer timer = new Timer(1);
        Timer timer5 = new Timer(5);
        Timer timer7 = new Timer(7);
        TimeReader timeReader = new TimeReader(timer);
        TimeReader timeReader5 = new TimeReader(timer5);
        TimeReader timeReader7 = new TimeReader(timer7);

        timer.start();
        timer5.start();
        timer7.start();
        timeReader.start();
        timeReader5.start();
        timeReader7.start();


    }
}