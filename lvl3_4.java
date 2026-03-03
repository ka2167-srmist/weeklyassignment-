import java.util.Scanner;

class TravelComputationUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter Distance from FromCity to ViaCity (km): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter Distance from ViaCity to ToCity (km): ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter Time from FromCity to ViaCity (minutes): ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter Time from ViaCity to ToCity (minutes): ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is "
                + totalTime + " minutes");
    }
}