import java.util.List;

interface EquationPrototype {
    Equation clone();
    List<Double> solve();
}