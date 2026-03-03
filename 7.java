class EarthVolume {
    public static void main(String[] args) {

        double radius = 6378;
        double pi = 3.14159;

        double volumeKm = (4.0 / 3) * pi * radius * radius * radius;

        double conversionFactor = 1.609; 
        double volumeMiles = volumeKm / (conversionFactor * conversionFactor * conversionFactor);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}