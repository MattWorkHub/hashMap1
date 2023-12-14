import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> food = new HashMap<>();
        HashMap<Integer, String> teachers = new HashMap<>();
        HashMap<String, Integer> numbers = new HashMap<>();

        food.put("Italy", "Pizza");
        teachers.put(0, "Gianni");
        numbers.put("Real", 1);

        System.out.println(food);
        System.out.println(teachers);
        System.out.println(numbers);

    }
}