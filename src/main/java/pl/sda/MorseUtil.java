package pl.sda;

import com.google.common.base.Joiner;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by jakubwrabel on 11.01.2017.
 */
public class MorseUtil {

    public static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " "};
    public static String[] dottie = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|"};

    public static BiMap<String, String> biMap = HashBiMap.create();

    static {
        for (int i = 0; i < alpha.length; i++) {
            biMap.put(alpha[i], dottie[i]);
        }
    }

    public static String translateToMorse(String text) {
        String[] split = text.split("");

        StringBuilder morseString = new StringBuilder();

        for (String element : split) {
            String convertedChar = convertChar(element, true);
            morseString.append(convertedChar);
            morseString.append(" ");
        }

        return morseString.toString();
    }

    public static String convertChar(String charToConvert, boolean toMorse) {
//        BiMap<String, String> biMap = HashBiMap.create();
//
//        for (int i = 0; i < alpha.length; i++) {
//            biMap.put(alpha[i], dottie[i]);
//        }

        charToConvert = charToConvert.toLowerCase();

        if (toMorse) {
            return biMap.get(charToConvert);
        } else {
            return biMap.inverse().get(charToConvert);
        }

    }
}