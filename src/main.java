
import util.*;
import util.NN.ActivationFunctions;
import util.NN.NeuralNetwork;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws MatrixCalculationException {
        double dataSet[] = new double[]{3,2};
        double e[] = new double[]{3,3,8};
       NeuralNetwork nn = new NeuralNetwork(2,4,3);
      nn.predict(dataSet);
      nn.train(dataSet,e);



    }
}
