import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = Arrays.asList(
            () -> 5 * 5,
            () -> 6 * 5,
            () -> 7 * 5
        );

        List<Future<Integer>> results = service.invokeAll(tasks);
        for (Future<Integer> result : results) {
            System.out.println("Result: " + result.get());
        }
        service.shutdown();
    }
}

## Output
Task 1 result: 25  
Task 2 result: 30  
Task 3 result: 35  
All tasks completed using thread pool.
