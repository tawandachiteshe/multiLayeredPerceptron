
/*
 * Copyright (c) 2019. Author Tawanda Chiteshe
 */

import util.*;
import util.NN.ActivationFunctions;
import util.NN.NeuralNetwork;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws MatrixCalculationException {
        matrix m = new matrix(2,3);
        m.randomize();
        double[] arry = matrix.toArray(m);
        double dataSet[] = new double[]{0};
        double e[] = new double[]{1,1};
       NeuralNetwork nn = new NeuralNetwork(2,2,1);

        for (int i = 0; i < 5000; i++) {
            nn.train(e, dataSet);
        }

        System.out.println( Arrays.deepToString(nn.predict(e).getData()));

        }

}
