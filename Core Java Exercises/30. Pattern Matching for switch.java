public class TypeChecker {
    public static void main(String[] args) {
        printType(42);
        printType("OpenAI");
        printType(3.14);
        printType(true);
    }

    static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            case Boolean b -> System.out.println("Boolean: " + b);
            default -> System.out.println("Unknown type");
        }
    }
}


##Output
  Integer: 42
  String: OpenAI
  Double: 3.14
  Boolean: true
