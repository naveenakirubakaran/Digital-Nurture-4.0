import java.util.*;
import java.util.stream.Collectors;

public class StreamEvenFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 10, 15);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}


## Output
  Even numbers: [4, 8, 10]
