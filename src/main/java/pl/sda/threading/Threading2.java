package pl.sda.threading;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class Threading2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                char[] chars = new char[]{'-', '\\', '|', '/'};

                for (int i = 0; true; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        break;
                    }

                    for (int j = 0; j < 50; j++) {
                        System.out.println();
                    }

                    System.out.print(chars[i%4] + " ");
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        long sum = sum(10_000_000_000l);
        System.out.println("\nSuma: " + sum);

        thread.interrupt();


    }

    public static long sum(long x) {
        long sum = 0;
        for (long i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
