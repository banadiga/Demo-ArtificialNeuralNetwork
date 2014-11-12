package perceptron;

public final class DataSource {

    public static final int count;

    public static final double[][] input;

    public static final double[] output;

    static {
        input = new double[][] {
                { 0, 0 },
                { 0, 1 },
                { 1, 0 },
                { 1, 1 }
        };
        // OR
        output = new double[] { 0, 1, 1, 1 };
        // AND
        // output = new double[] { 0, 0, 0, 1 };
        // XOR
        // output = new double[] { 1, 0, 0, 1 };
        count = input[0].length;
    }

}
