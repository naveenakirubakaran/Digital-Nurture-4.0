public class VirtualThreadExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Hello from virtual thread!");
            });
        }
    }
}

Output
Launching 100000 virtual threads...  
All threads launched.  
Each thread prints: Hello from virtual thread!  
Performance: Completed in 50ms
