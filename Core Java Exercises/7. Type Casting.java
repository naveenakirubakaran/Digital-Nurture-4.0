public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.7;
        int i = (int) d; // explicit casting
        System.out.println("Double to Int: " + i);

        int x = 10;
        double y = x; // implicit casting
        System.out.println("Int to Double: " + y);
    }
}


##Output
  Double to Int: 9
  Int to Double: 10.0
