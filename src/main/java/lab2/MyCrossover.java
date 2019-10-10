package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList<double[]> children = new ArrayList<double[]>();
        double[] child_1 = p1.clone();
        double[] child_2 = p2.clone();
        for(int j=0; j<i; j++){
            int change = random.nextInt(p1.length);
            child_1[change] = p2[change];
            child_2[change] = p1[change];
        }
        children.add(child_1);
        children.add(child_2);
        return children;
    }
}
