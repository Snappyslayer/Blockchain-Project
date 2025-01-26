import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[3]; // Initialize the array with size 3

        System.out.print("Enter marks for Physics, Chemistry, and Maths out of 100: ");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Marks are: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }
}
