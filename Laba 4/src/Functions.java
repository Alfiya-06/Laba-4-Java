import java.util.ArrayList;
import java.util.List;

interface Function<T, P> {
    P apply(T value);
}

public class Functions {
    public static <T, P> List<P> transform(List<T> list, Function<T, P> function) {
        List<P> result = new ArrayList<>();
        for (T element: list) {
            result.add(function.apply(element));
        }
        return result;
    }
}