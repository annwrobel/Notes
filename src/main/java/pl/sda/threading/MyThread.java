package pl.sda.threading;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
