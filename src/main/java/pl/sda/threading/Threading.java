package pl.sda.threading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class Threading {
    private static int x;

    public static void main(String[] args) throws IOException, InterruptedException {

//        Runnable runnable = new MyThread();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };

//        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        System.out.println("Przed wywołaniem");
//        thread.start();
        thread2.start();
        System.out.println("Po wywołaniu");

//        for(int clear = 0; clear < 1000; clear++)
//        {
//            System.out.println("\b") ;
//        }

        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }

        List<Integer> list = new ArrayList<>();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 10000; i++) {
//                    synchronized (list) {
//                        list.add(i);
                    setX(i);
//                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        Runnable runnableX = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 10000; i++) {
//                    synchronized (list) {
                    setX(i);
//                        list.add(i);
//                    }
                }
            }
        };
        Thread threadX = new Thread(runnableX);
        thread.start();
        threadX.start();

        thread.join();
        threadX.join();

        System.out.println(list.size());



//        Thread thread1 = new MyThread2();
//        thread1.start();
    }


    public static void setX(int x ){
        Threading.x = x;
    }


}
