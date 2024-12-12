import java.util.ArrayList;
import java.util.List;

public class FindUniq {
    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> unique = new ArrayList<>();
        for (Integer num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        return unique;
    }
}
