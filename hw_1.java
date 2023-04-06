// Задача 1.
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hw_1 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 291111111, bookPhone);
        addNumber("Петров", 332222222, bookPhone);
        addNumber("Сидоров", 443333333, bookPhone);
        addNumber("Сидоров", 443333334, bookPhone);
        addNumber("Иванов", 291111112, bookPhone);
        addNumber("Иванов", 291111113, bookPhone);
        printBook(bookPhone);
       }
}
