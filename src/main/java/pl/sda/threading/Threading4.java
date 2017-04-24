package pl.sda.threading;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class Threading4 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> integerList = new ArrayList<>();

        Object x = new Object();
        Object y = new Object();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                synchronized (x) {
                    System.out.println("Zablokowałem X");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (y) {
                        System.out.println("Koniec wątku 1");
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                synchronized (y) {
                    System.out.println("Zablokowałem Y");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (x) {
                        System.out.println("Koniec drugiego wątrku");
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
//
//
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100_000; i++) {
//                    synchronized (integerList) {
//                        integerList.add(i);
//                    }
//                }
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        Thread thread2 = new Thread(runnable);
//        thread2.start();
//
//        thread.join();
//        thread2.join();
//
//        System.out.println(integerList.size());


    }

    synchronized public int getX(){
        return 0;
    }
}
