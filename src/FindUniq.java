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
//    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
//        List<Integer> uniqueNumbers = FindUniq.findUnique(numbers);
//        System.out.println("Unique Numbers: " + uniqueNumbers);
//    }
//}
