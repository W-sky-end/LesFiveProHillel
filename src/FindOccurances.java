import java.util.ArrayList;
import java.util.List;

public class FindOccurances {
    public static class WordOccurance {
        String name;
        int count;

        public WordOccurance(String name, int count) {
            this.name = name;
            this.count = count;
        }

        @Override
        public String toString() {
            return "{name: \"" + name + "\", count: " + count + "}";
        }
    }

    public static List<WordOccurance> findOccurances(List<String> list) {
        List<WordOccurance> occurrences = new ArrayList<>();

        for (String word : list) {
            boolean found = false;
            for (WordOccurance occurrence : occurrences) {
                if (occurrence.name.equals(word)) {
                    occurrence.count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                occurrences.add(new WordOccurance(word, 1));
            }
        }
        return occurrences;
    }
}


//    public static void main(String[] args) {
//        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
//        List<WordOccurance> result = findOccurances(words);
//        for (WordOccurance occ : result) {
//            System.out.println(occ);
//        }
//    }
//}