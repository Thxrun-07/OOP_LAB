import java.util.*;
class CgpaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your last completed semester : ");
        int semesters = input.nextInt();
        if (semesters <= 0) {
            System.out.println("you must complete at least 1 semester to calculate CGPA.");
        } else {
            double totalSgpa = 0.0;
            for (int i = 1; i <= semesters; i++) {
                System.out.print("enter SGPA for semester " + i + " : ");
                double sgpa = input.nextDouble();
                totalSgpa = totalSgpa + sgpa;
            }
            double cgpa = totalSgpa / semesters;
            System.out.println("your overall CGPA is: " + cgpa);
        }
        
    }
}