package perceptron;

import java.util.Arrays;

public class Application {

    private IArtificialNeuralNetwork artificialNeuralNetwork;

    public Application() {
        artificialNeuralNetwork = new ArtificialNeuralNetwork(DataSource.count);
    }

    private void study(double[][] input, double[] output) {
        System.out.println("Study...");
        int iterations = artificialNeuralNetwork.study(input, output);
        System.out.println("Count of iterations :" + iterations);
    }

    private void test(double[][] input) {
        for (int row = 0; row < input.length; row++) {
            double[] enters = Arrays.copyOf(input[row], input[row].length);
            System.out.println("Input :" + Arrays.toString(enters) + " result " + artificialNeuralNetwork.getResult(enters));
        }
    }

    public static void main(String[] args) {
        Application application = new Application();

        System.out.println("-----------------------------------");
        System.out.println("Test without study.");
        application.test(DataSource.input);

        System.out.println("-----------------------------------");
        application.study(DataSource.input, DataSource.output);

        System.out.println("-----------------------------------");
        System.out.println("Test after study");
        application.test(DataSource.input);

        System.out.println("-----------------------------------");
        System.out.println("Other input data");
        application.test(new double[][] { { 1, 0 } });
    }
}
