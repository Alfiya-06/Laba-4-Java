import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1.2. Обобщенные типы");

        Storage<Integer> nullStorage = new Storage<>(null);
        IntStorage(nullStorage, 0);

        Storage<Integer> intStorage = new Storage<>(99);
        IntStorage(intStorage, -1);

        Storage<String> nullstringStorage = new Storage<>(null);
        StringStorage(nullstringStorage, "default");

        Storage<String> stringStorage = new Storage<>("hello");
        StringStorage(stringStorage, "hello world");

        System.out.println("\nЗадание 1.5");
        System.out.println("Введите координаты для линии:");
        int x1 = readInt(scanner, "x1 = ");
        int y1 = readInt(scanner, "y1 = ");
        int z1 = readInt(scanner, "z1 = ");
        int x2 = readInt(scanner, "x2 = ");
        int y2 = readInt(scanner, "y2 = ");
        int z2 = readInt(scanner, "z2 = ");

        Point3 point1 = new Point3(x1, y1, z1);
        Point3 point2 = new Point3(x2, y2, z2);
        Line<Point3> line = new Line<>(point1, point2);
        System.out.println("Создана линия: " + line);
        System.out.println("Её длина = " + line.getLength());

        System.out.println("\nЗадание 2.1. Сдвинуть линию");
        System.out.println("Линия до сдвига: " + line);
        Line10(line);
        System.out.println("Линия после сдвига по оси X на +10: " + line);
    }
    public static <T extends Point> void Line10(Line<T> line) {
        T start = line.getStart();
        start.setX(start.getX() + 10);
        line.setStart(start);
    }

    private static void IntStorage(Storage<Integer> storage, int alternative) {
        int result = storage.getValue(alternative);
        System.out.println("Хранилище: " + storage + ", результат: " + result);
    }

    private static void StringStorage(Storage<String> storage, String alternative) {
        String result = storage.getValue(alternative);
        System.out.println("Хранилище: " + storage + ", результат: " + result);
    }

    private static int readInt(Scanner scanner, String text) {
        while (true) {
            System.out.print(text);
            String input = scanner.next();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Нужно ввести целое число.");
            }
        }
    }
}