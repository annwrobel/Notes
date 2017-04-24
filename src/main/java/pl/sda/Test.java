package pl.sda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jakubwrabel on 11.01.2017.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        IntStream.range(0, 1000).map(x -> x * x).forEach(x -> System.out.println(x));
//        Arrays.stream("bbbbbb".split("")).map(x->m)

//        for (int i = 0; i < 10000000; i++) {
//            String s = MorseUtil.translateToMorse("Ala ma kota");
//        }
    }
}
