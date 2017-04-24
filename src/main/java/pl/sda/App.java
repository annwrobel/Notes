package pl.sda;

import org.apache.commons.mail.EmailException;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws EmailException, IOException {
//        MailSender.sendMailWithMessageFromFile("javandwro1@gmail.com",
////                "Hello mail from JWrabel #3", "file.txt");

        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            String convert = MorseUtil.translateToMorse("ALA MA KOTA");
        }
        long stop = System.nanoTime();

        double duration = (stop - start)/1000000000d;

        System.out.println(duration);
    }
}
