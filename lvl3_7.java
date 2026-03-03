import java.util.Scanner;

class ChocolateDistribution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter Number of Children: ");
        int numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is "
                + chocolatesPerChild +
                " and the number of remaining chocolates are "
                + remainingChocolates);
    }
}