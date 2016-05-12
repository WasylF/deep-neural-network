package wslf.neural;

/**
 * Created by Wsl_F
 */

public class LastSigmoidLayer extends SigmoidLayer {
    public LastSigmoidLayer(int inputSize, int size, boolean bipolar) {
        super(inputSize, size, bipolar);
        indexMaxNeuron = -1;
    }

    public LastSigmoidLayer(int inputSize, int size) {
        this(inputSize, size, true);
    }

    private int indexMaxNeuron;

    /**
     * @return идекс нейрона с наибольшим выходом
     */
    public int getMaxNeuron() {
        return indexMaxNeuron;
    }

    @Override
    public float[] computeOutput(float[] input) {
        float[] output = super.computeOutput(input);
        indexMaxNeuron = 0;
        for (int i = 1; i < output.length; i++) {
            if (output[i] >= output[indexMaxNeuron]) {
                indexMaxNeuron = i;
            }
        }

        return output;
    }
}