public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result: " + result); // 5*2 = 10 -> 10+10 = 20

        int result2 = (10 + 5) * 2;
        System.out.println("Result with parentheses: " + result2); // 15*2 = 30
    }
}
## Output
Result: 20
Result with parentheses: 30
