import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ArrayToList {
    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }
}

//    public static void main(String[] args) {
//        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        List<Integer> list = arrayToList(array);
//        System.out.println(list);



