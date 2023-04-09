package lab5a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создаем список целых чисел
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);

        // Создаем map для хранения чисел и их количества в списке
        Map<Integer, Integer> map = new HashMap<>();

        // Проходим по списку и увеличиваем количество каждого числа в map
        for (int number : numbers) {
            if (map.containsKey(number)) {
                int amount = map.get(number);
                map.put(number, amount + 1);
            } else {
                map.put(number, 1);
            }
        }

        // Выводим на экран все уникальные числа, которые встречаются в списке больше одного раза
        System.out.println("Уникальные числа, которые встречаются в списке больше одного раза:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
