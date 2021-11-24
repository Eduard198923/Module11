public class Time {
    private static Integer count = 0;
    private static final int TIME = 26;

    public static void main(String[] args) {
        showDataOfTime();

    }

    private static void showDataOfTime() {
        count = 0;
        Thread myThread = new Thread(() -> {
            synchronized (Thread.currentThread()) {
                while (count < TIME) {
                    try {
                    if (count % 5 == 0 && count != 0)
                        System.out.println("Прошло 5 секунд");
                        Thread.currentThread().wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

        });

        myThread.start();
        while (count < TIME) {
            try {
                Thread.sleep(1000);
                System.out.println(count++);
                synchronized (myThread) {
                    myThread.notifyAll();
                }

                } catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }


