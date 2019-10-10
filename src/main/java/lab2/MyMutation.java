package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    private double generation = 1;
    public List<double[]> apply(List<double[]> population, Random random) {
        generation += 1;
        double mutation_probability = 0.3;
        ArrayList<double[]> mutated_population = new ArrayList<double[]>();
        for(double[] individual : population){
            double[] new_individual = individual.clone();
            for(int j = 0; j < new_individual.length; j++){
                if(random.nextDouble() < mutation_probability) {
                    // Higher exponents give better results but less likely convergence since
                    // exploration phase is shorter.
                    new_individual[j] += random.nextGaussian() / Math.pow(generation, 1.2);
                    new_individual[j] = Math.min(5, Math.max(-5, new_individual[j]));
                }
            }
            mutated_population.add(new_individual);
        }
        return mutated_population;
    }
}