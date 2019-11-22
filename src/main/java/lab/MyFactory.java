package lab;

import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.*;

public class MyFactory extends AbstractCandidateFactory<List<Integer>> {

    private int dimension;

    MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public List<Integer> generateRandomCandidate(Random random) {
        List<Integer> candidate = new ArrayList<Integer>();
        for(int i=0; i<dimension; i++){
            candidate.add(i);
        }
        Collections.shuffle(candidate);
        return candidate;
    }
}

