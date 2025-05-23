import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        StringBuilder reversed = new StringBuilder(original).reverse();
        System.out.println("Reversed string: " + reversed);
    }
}

## Output
  Enter a string: Hello
  Reversed string: olleH
