package Collections;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("mama", "tato", "brat", "siostra", "brat", "Brat");
        Map<String, Integer> count = new HashMap<>();

        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }
        ;
        for (Map.Entry<String, Integer> stringIntegerEntry : count.entrySet()) {
            System.out.println(stringIntegerEntry.toString());
        }
    }
}
