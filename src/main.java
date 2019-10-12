
import util.*;
import util.NN.ActivationFunctions;
import util.NN.NeuralNetwork;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws MatrixCalculationException {
        matrix m = new matrix(2,3);
        m.randomize();
        double[] arry = matrix.toArray(m);
        double dataSet[] = new double[]{1};
        double e[] = new double[]{1,0};
       NeuralNetwork nn = new NeuralNetwork(2,3,1);

        for (int i = 0; i < 100; i++) {

            matrix predict =  nn.predict(e);
            double[] pedict = matrix.toArray(predict);
            nn.predict(e);
            nn.train(e, dataSet);

            System.out.println( Arrays.deepToString(predict.getData()));
        }
        }

}
