public class There5 extends Thread {
    private final A app;
    private final String message;

    public There5(A app, String message) {
        this.app = app;
        this.message = message;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            int n;
            try {
                n = app.last();
                System.out.println(n);

                if (n % 5 == 0)
                    System.out.println(message + " 5");
                if (n % 7 == 0)
                    System.out.println(message+" 7");

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
