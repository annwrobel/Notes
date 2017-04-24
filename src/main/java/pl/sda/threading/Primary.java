package pl.sda.threading;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class Primary {
    public static void main(String[] args) {
        Primary.checkPrime(15485857);
    }

    public static void checkPrime(int x) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i < x / 4; i++) {
                    if (x % i == 0) {
                        System.out.println("Liczba nie jest liczbą pierwszą");
                    }
                }
            }
        };
        Thread thread1 = new Thread(runnable1);

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = x/4; i < x / 2; i++) {
                    if (x % i == 0) {
                        System.out.println("Liczba nie jest liczbą pierwszą");
                    }
                }
            }
        };
        Thread thread2 = new Thread(runnable2);
//        for (int i = 2; i < x / 2; i++) {
//            if (x % i == 0) {
//                System.out.println("Liczba nie jest liczbą pierwszą");
//            }
//
//        }

        thread1.start();
        thread2.start();
    }
}
