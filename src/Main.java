import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> filtredList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>(evenList);

//        Фильтруем положительные числа.
        for (Integer num : intList) {
            if (num > 0) {
                filtredList.add(num);
            }
        }
        //       System.out.println(filtredList);

//        Ищем среди этих положительных чисел четные.
        for (Integer num : filtredList) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
//        System.out.println(evenList);

//        Отсортируем отфильтрованные числа в порядке возрастания.
        Collections.sort(sortedList);
        System.out.println(sortedList);

    }
}