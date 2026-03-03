import java.util.Scanner;

class MaximumHandshakes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int numberOfStudents = input.nextInt();

        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The number of possible handshakes is "
                + maximumHandshakes);
    }
}