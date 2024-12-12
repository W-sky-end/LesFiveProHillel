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
