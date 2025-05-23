import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Adam", "Liam", "Eva");

        // Sort using lambda
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted List:");
        names.forEach(System.out::println);
    }
}

## Output
Sorted List:
Adam
Eva
Liam
Zara
