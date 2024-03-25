import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;

class CustomsAdapter implements Customs {
    private static final float USD_TO_UAH_RATE = 39f; // hypothetical conversion rate
    private CarCalculator calculator;

    public CustomsAdapter(CarCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle vehicle = convertToVehicle(auto);
        calculator.setVehicle(vehicle);
        String priceUSD = calculator.calculatePrice();
        int price = Integer.parseInt(priceUSD.replace("USD", "").trim());
        return price * USD_TO_UAH_RATE;
    }

    @Override
    public float tax(Auto auto) {
        float priceUAH = vehiclePrice(auto);
        return priceUAH * 0.2f;
    }

    private Vehicle convertToVehicle(Auto auto) {
        boolean isDamaged = auto.getDamage() > 0;
        float damagePercent = isDamaged ? auto.getDamage() : 0;
        return new Vehicle(auto.getAge(), auto.getModel(), damagePercent, auto.getMileage());
    }

    public String formatPriceWithCurrency(float price) {
        return Math.round(price) + " UAH";
    }
}
