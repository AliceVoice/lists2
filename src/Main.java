import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Set<Integer> uniqueEvenNumbers = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }

        List<Integer> sortedUniqueEvenNumbers = new ArrayList<>(uniqueEvenNumbers);
        sortedUniqueEvenNumbers.sort(null);

        for (Integer evenNum : sortedUniqueEvenNumbers) {
            System.out.println(evenNum);
        }
    }

    public static void task3() {
        String text = "это пример текста с повторяющимися словами пример и повторяющимися";

        String[] words = text.split(" ");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCountMap.keySet()) {
            System.out.println(wordCountMap.get(word));
        }
    }
}
