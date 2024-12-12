import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ArrayToList {
    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }
}
