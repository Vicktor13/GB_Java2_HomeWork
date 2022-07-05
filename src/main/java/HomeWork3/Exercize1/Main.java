package HomeWork3.Exercize1;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[0] = "words1";
        words[1] = "words2";
        words[2] = "words3";
        words[3] = words[1];
        words[4] = words[0];
        words[5] = "words4";
        words[6] = words[0];
        words[7] = words[2];
        words[8] = words[0];
        words[9] = "words5";
        Map<String, Integer> map = new TreeMap<>();

        checkArrayThroughStream(words, map);

        printMap(map);
    }

    private static void printMap(Map<String, Integer> map) {
        map.forEach((String s, Integer integer) ->
                System.out.printf("Слово %s встречается %d раз%n", s, integer));
    }

    private static void checkArrayThroughStream(String[] words, Map<String, Integer> map) {
        for (String word : words) {
            map.put(word, (int) Arrays.stream(words).filter(word :: equals).count());
        }

    }
}
