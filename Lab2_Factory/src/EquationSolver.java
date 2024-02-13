import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        List<Equation> equations = readEquationsFromFile("Lab2_Factory/input01.txt");

        for (Equation equation : equations) {
            List<Double> solutions = equation.solve();
            analyzeAndPrintSolutions(equation, solutions);
        }
    }

    private static List<Equation> readEquationsFromFile(String fileName) {
        List<Equation> equations = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                if (!line.isEmpty()) {
                    List<Double> coefficients = Arrays.stream(line.split("\\s+"))
                            .map(Double::parseDouble)
                            .toList();

                    Equation equation;
                    if (coefficients.size() == 2) {
                        equation = new LinearEquation(coefficients);
                    } else if (coefficients.size() == 3) {
                        equation = new QuadraticEquation(coefficients);
                    } else if (coefficients.size() == 5) {
                        equation = new BiQuadraticEquation(coefficients);
                    } else {
                        equation = null;
                    }

                    if (equation != null) {
                        equations.add(equation);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return equations;
    }


    private static void analyzeAndPrintSolutions(Equation equation, List<Double> solutions) {
        System.out.println("Equation: " + equation.coefficients);
        int numSolutions = solutions.size();

        if (numSolutions == 0) {
            System.out.println("No real solutions");
        } else {
            System.out.println("Number of solutions: " + numSolutions);

            for (int i = 0; i < numSolutions; i++) {
                System.out.println("Solution " + (i + 1) + ": " + solutions.get(i));
            }

            if (numSolutions == 1) {
                System.out.println("Equation with the smallest solution: " + equation.coefficients);
            } else if (numSolutions > 1) {
                System.out.println("Equation with the largest solution: " + equation.coefficients);
            }
        }

        System.out.println();
    }
}
