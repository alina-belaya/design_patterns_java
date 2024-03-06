import java.util.ArrayList;
import java.util.List;

class LinearEquation extends Equation {
    public LinearEquation(List<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public Equation clone() {
        return new LinearEquation(new ArrayList<>(this.coefficients));
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();
        double b = coefficients.get(0);
        double c = coefficients.get(1);

        if (b != 0) {
            solutions.add(-c / b);
        } else {
            solutions.add(Double.POSITIVE_INFINITY);
        }

        return solutions;
    }
}