import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
    public static int countOccurance(List<String> list, String word) {
        int count = 0;
        for (String str : list) {
            if (str.equals(word)) {
                count++;
            }
        }
        return count;
    }
}

//    public static void main(String[] args) {
//        List<String> words = List.of("cat", "dog", "cat", "bird", "dog",
//                "dog","fox","monkey","mouse","snake","cow","cow","fox");
//        System.out.println("count of 'cow' : " + countOccurance(words, "cow"));
//    }
//    }
