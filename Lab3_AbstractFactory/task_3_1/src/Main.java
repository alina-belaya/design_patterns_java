public class Main {
    public static void main(String[] args) {
        int N = 10000;
        int A = 5; // buses
        int T = 3; // trams
        int Tr = 4; // trolleybuses

        TransportFactory skodaFactory = new SkodaFactory();
        TransportFactory volvoFactory = new VolvoFactory();
        TransportFactory hyundaiFactory = new HyundaiFactory();

        calculateAndPrintTotalCost(skodaFactory, A, T, Tr, N, "Skoda");
        calculateAndPrintTotalCost(volvoFactory, A, T, Tr, N, "Volvo");
        calculateAndPrintTotalCost(hyundaiFactory, A, T, Tr, N, "Hyundai");
    }

    private static void calculateAndPrintTotalCost(
            TransportFactory factory,
            int quantityOfBuses,
            int quantityOfTrams,
            int quantityOfTrolleybuses,
            int totalDistance,
            String factoryName
    ) {
        Bus[] buses = new Bus[quantityOfBuses];
        Tram[] trams = new Tram[quantityOfTrams];
        Trolleybus[] trolleybuses = new Trolleybus[quantityOfTrolleybuses];

        for (int i = 0; i < quantityOfBuses; i++) {
            buses[i] = factory.createBus();
        }

        for (int i = 0; i < quantityOfTrams; i++) {
            trams[i] = factory.createTram();
        }

        for (int i = 0; i < quantityOfTrolleybuses; i++) {
            trolleybuses[i] = factory.createTrolleybus();
        }

        int totalPurchaseCost = calculateTotalPurchaseCost(buses, trams, trolleybuses);
        double totalOperatingCost = calculateTotalOperatingCost(buses, trams, trolleybuses, totalDistance);

        System.out.println("Factory: " + factoryName);
        System.out.println("Total purchase cost: " + totalPurchaseCost + " grn");
        System.out.println("Total operating cost: " + totalOperatingCost + " grn");
        System.out.println("-----------------------------");
    }


    private static int calculateTotalPurchaseCost(Bus[] buses, Tram[] trams, Trolleybus[] trolleybuses) {
        int totalCost = 0;

        for (Bus bus : buses) {
            totalCost += bus.getPurchaseCost();
        }

        for (Tram tram : trams) {
            totalCost += tram.getPurchaseCost();
        }

        for (Trolleybus trolleybus : trolleybuses) {
            totalCost += trolleybus.getPurchaseCost();
        }

        return totalCost;
    }

    private static double calculateTotalOperatingCost(Bus[] buses, Tram[] trams, Trolleybus[] trolleybuses, int totalDistance) {
        double totalCost = 0;

        for (Bus bus : buses) {
            totalCost += bus.getOperatingCost() * totalDistance;
        }

        for (Tram tram : trams) {
            totalCost += tram.getOperatingCost() * totalDistance;
        }

        for (Trolleybus trolleybus : trolleybuses) {
            totalCost += trolleybus.getOperatingCost() * totalDistance;
        }

        return totalCost;
    }
}
