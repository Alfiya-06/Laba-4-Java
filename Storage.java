public class Storage <T> {
    private final T value;

    public Storage(T value) {
        this.value = value;
    }

    public T getValue(T alternative) {
        if (value != null) {
            return value;
        } else {
            return alternative;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
