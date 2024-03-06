import java.util.ArrayList;
import java.util.List;

class Equation implements EquationPrototype {
    protected List<Double> coefficients;

    public Equation(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public Equation clone() {
        return new Equation(new ArrayList<>(this.coefficients));
    }

    @Override
    public List<Double> solve() {
        return null;
    }
}