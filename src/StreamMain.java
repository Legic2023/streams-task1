import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Stream<Integer> stream = intList.stream()
                .filter(x -> x > 0)                 // Фильтруем положительные числа.
                .filter(x -> x % 2 == 0)            // Ищем среди этих положительных чисел четные.
                .sorted(Comparator.naturalOrder());  // Отсортируем отфильтрованные числа в порядке возрастания.

        stream
                .forEach(System.out::println);

    }
}

