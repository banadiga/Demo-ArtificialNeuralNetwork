package perceptron;

public interface IArtificialNeuralNetwork {

    // return number of iterations
    int study(double[][] input, double[] output);

    //
    int getResult(double[] enters);
}
