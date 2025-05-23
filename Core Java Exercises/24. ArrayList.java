import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student name: ");
            students.add(sc.nextLine());
        }

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}

## Output
  Enter student name: Alice
  Enter student name: Bob
  Enter student name: Charlie
  Student Names:
  Alice
  Bob
  Charlie
