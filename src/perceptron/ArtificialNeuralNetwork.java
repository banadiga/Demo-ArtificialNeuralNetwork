package perceptron;

import java.util.Arrays;

public class ArtificialNeuralNetwork implements IArtificialNeuralNetwork {

    // Count of enters and count of weights.
    private int length;

    private double[] enters;

    private double[] weights;

    public ArtificialNeuralNetwork(int length) {
        this.length = length;
        // Create enters and weights
        enters = new double[length];
        weights = new double[length];
        // Set random value
        for (int i = 0; i < length; i++) {
            weights[i] = Math.random();
        }
        System.out.println("Random weights :" + Arrays.toString(weights));
    }

    @Override
    public int getResult(double[] enters) {
        double outer = 0;
        // TODO calc outer as SUM(ters[i] * weights[i])
        // TODO return design (true|false)[(1|0)]
        return 0;
    }

    @Override
    public int study(double[][] input, double[] output) {
        // general error
        double gError = 0;
        // count of iterations
        int iterations = 0;
        do {
            // reinit global error
            gError = 0;
            // row by row
            for (int row = 0; row < length; row++) {
                enters = Arrays.copyOf(input[row], length);

                // get result
                int outer = getResult(enters);
                // get lcal error
                double error = output[row] - outer;
                // get global error
                gError += Math.abs(error);

                // recalc weights
                // TODO calc new weights taking to accout error and enters[i]
            }
            iterations++;

        } while (gError != 0);

        // out weights
        System.out.println("Weights :" + Arrays.toString(weights));

        return iterations;
    }
}
