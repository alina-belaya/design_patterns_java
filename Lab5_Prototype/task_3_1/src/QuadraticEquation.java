import java.util.ArrayList;
import java.util.List;

class QuadraticEquation extends Equation {
    public QuadraticEquation(List<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public Equation clone() {
        return new QuadraticEquation(new ArrayList<>(this.coefficients));
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();
        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);

        if (a == 0) {
            solutions.addAll(new LinearEquation(coefficients.subList(1, 3)).solve());
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                solutions.add((-b + Math.sqrt(discriminant)) / (2 * a));
                solutions.add((-b - Math.sqrt(discriminant)) / (2 * a));
            } else if (discriminant == 0) {
                solutions.add(-b / (2 * a));
            }
        }

        return solutions;
    }
}