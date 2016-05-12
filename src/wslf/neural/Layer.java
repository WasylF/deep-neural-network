package wslf.neural;

import java.io.Serializable;

/**
 * Created by Wsl_F
 */

/**
 * Interface of neural layer
 */
public interface Layer extends Serializable {
    /**
     * Получает размер входного вектора
     *
     * @return Размер входного вектора
     */
    int getInputSize();

    /**
     * Получает размер слоя
     *
     * @return Размер слоя
     */
    int getSize();

    /**
     * Вычисляет отклик слоя
     *
     * @param input Входной вектор
     * @return Выходной вектор
     */
    float[] computeOutput(float[] input);
}