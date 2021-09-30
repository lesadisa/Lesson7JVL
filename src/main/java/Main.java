public class Main {

    public Main(int lifetime) throws InterruptedException {
        A a = new A();
        String secondary = "Secondary!";
        There1 t1 = new There1(a);
        There5 t5 = new There5(a, secondary);
        t1.start();
        t5.start();

        Thread.sleep(lifetime * 1000L);
        t1.interrupt();
        t5.interrupt();

    }

    public static void main(String[] args) throws InterruptedException {
        new Main(15);
    }
}