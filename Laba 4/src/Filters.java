import java.util.ArrayList;
import java.util.List;

interface Filter<T> {
    boolean test(T value);
}

public class Filters {
    public static <T> List<T> filter(List<T> list, Filter<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) result.add(item);
        }
        return result;
    }
}