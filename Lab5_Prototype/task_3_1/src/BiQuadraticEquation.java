import java.util.ArrayList;
import java.util.List;

class BiQuadraticEquation extends Equation {
    public BiQuadraticEquation(List<Double> coefficients) {
        super(coefficients);
    }

    @Override
    public Equation clone() {
        return new BiQuadraticEquation(new ArrayList<>(this.coefficients));
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();
        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);
        double d = coefficients.get(3);
        double e = coefficients.get(4);

        if (a == 0) {
            solutions.addAll(new QuadraticEquation(coefficients.subList(1, 4)).solve());
        } else {
            List<Double> quadraticCoefficients = new ArrayList<>();
            quadraticCoefficients.add(a);
            quadraticCoefficients.add(c);
            quadraticCoefficients.add(e);

            QuadraticEquation quadraticEquation = new QuadraticEquation(quadraticCoefficients);
            List<Double> quadraticSolutions = quadraticEquation.solve();

            for (Double quadraticSolution : quadraticSolutions) {
                if (quadraticSolution >= 0) {
                    double sqrtQuadraticSol = Math.sqrt(quadraticSolution);
                    solutions.add(sqrtQuadraticSol);
                    solutions.add(-sqrtQuadraticSol);
                }
            }
        }

        return solutions;
    }
}