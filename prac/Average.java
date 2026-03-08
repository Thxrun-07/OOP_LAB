import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();
            sum += marks;
        }
        double average = (double) sum / n;
        System.out.println("Average marks = " + average);
    }
}