
import util.*;
import util.NN.ActivationFunctions;
import util.NN.NeuralNetwork;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws MatrixCalculationException {
        matrix a = new matrix(2,3);
        matrix b = new matrix(2,3);
        NeuralNetwork nn = new NeuralNetwork(2,4,3);
        matrix s = nn.predict(new double[]{3,2});
        System.out.println(Arrays.deepToString(s.getData()));
    }
}
