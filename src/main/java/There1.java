public class There1 extends Thread{

        private A app;

        public There1(A app) {
            this.app = app;
        }

        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                this.app.add();
            }
        }
    }
