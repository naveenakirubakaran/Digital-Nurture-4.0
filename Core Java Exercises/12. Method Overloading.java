public class OverloadingExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(2, 3));
        System.out.println("add(double, double): " + add(2.5, 3.5));
        System.out.println("add(int, int, int): " + add(1, 2, 3));
    }
}

## Output
  add(int, int): 5
add(double, double): 6.0
add(int, int, int): 6
