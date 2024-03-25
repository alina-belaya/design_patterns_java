import com.vehiclecalculator.CarCalculator;

public class Main3_2 {

    public static void main(String[] args) {
        Auto auto = new Auto(5, "Audi", 0.2f, 100_000);
        CarCalculator calculator = new CarCalculator();
        CustomsAdapter customsAdapter = new CustomsAdapter(calculator);

        float vehiclePrice = customsAdapter.vehiclePrice(auto);
        float taxAmount = customsAdapter.tax(auto);

        System.out.println("Vehicle Price: " + customsAdapter.formatPriceWithCurrency(vehiclePrice));
        System.out.println("Tax: " + customsAdapter.formatPriceWithCurrency(taxAmount));
    }
}
