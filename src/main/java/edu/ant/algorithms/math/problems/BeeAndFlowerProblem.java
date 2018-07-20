package edu.ant.algorithms.math.problems;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 * In a garden there are some bees and flowers.
 * If one bee sits on each flower thern one bee will be left.
 * If two bees sit on each flower, one flower will be left.
 * Find the number of bees and number of flowers
 * */

public class BeeAndFlowerProblem {

    public static void main(String[] args) {

        // bees = flowers + 1;
        // flowers = bees / 2 + 1;
        // ergo:
        // flowers - bees = -1
        // flowers - bees / 2 = 1

        /**
         * As linear system:
         *
         *  x - y = -1
         *  x - 0.5y = 1
         *
         * solved using matrix below.
         * */


        RealMatrix coefficients =
                new Array2DRowRealMatrix(new double[][] {{1, -1}, {1, -0.5}},
                        false);
        DecompositionSolver solver = new LUDecomposition(coefficients).getSolver();
        RealVector constants = new ArrayRealVector(new double[] {-1, 1}, false);
        RealVector solution = solver.solve(constants);
        System.out.println(solution);
    }

}
