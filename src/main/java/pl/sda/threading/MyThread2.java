package pl.sda.threading;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
