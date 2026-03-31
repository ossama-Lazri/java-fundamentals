import java.util.HashMap;

public class WordCounter {

    public static void main(String[] args) {

        String text = "java is good java is easy";

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}