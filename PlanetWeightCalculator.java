// A person weights on earth about 70kg, calculate his weight on diff planets (use lambda and multithreading)

import java.util.*;

public class PlanetWeightCalculator {

    Map<String, Double> planetGravity = Map.of(
        "Mercury", 0.38,
        "Venus", 0.91,
        "Mars", 0.38,
        "Jupiter", 2.34,
        "Saturn", 1.06,
        "Uranus", 0.92,
        "Neptune", 1.19
    );

    public void calculateWeightOnPlanets(double earthWeight) {
        planetGravity.forEach((planet, gravity) -> {
            Runnable task = () -> {
                double weight = earthWeight * gravity;
                System.out.println("Weight on " + planet + ": " + weight + " kg");
            };
            new Thread(task).start();
        });
    }

    public static void main(String[] args) {
        PlanetWeightCalculator calculator = new PlanetWeightCalculator();
        calculator.calculateWeightOnPlanets(70);
    }
}
