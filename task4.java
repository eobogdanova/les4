package les4;

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        String[] sport = {"footboll", "hockey", "volleyball", "skiing", "jumping", "cycling", "swimming", "boxing", "jumping", "tennis"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : sport) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(sport));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Bogdanova", "89123456789");
        pb.add("Kovganova", "89118765432");
        pb.add("Kovganova", "89634572882");

        System.out.println(pb.get("Kovganova"));
    }
}
