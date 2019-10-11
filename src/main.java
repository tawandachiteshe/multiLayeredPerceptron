
import util.*;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws MatrixCalculationException {
        matrix a = new matrix(2,3);
        matrix b = new matrix(2,3);
        double[] temp = {3,4,1};
        a.randomize();
        b.randomize();
        System.out.println("matrrix a");
        System.out.println(Arrays.deepToString(a.getData()));
        matrix s = matrix.fromArray(temp);
        System.out.println("array");
        System.out.println(Arrays.deepToString(s.getData()));

    }
}
