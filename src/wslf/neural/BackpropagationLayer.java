package wslf.neural;

/**
 * Created by Wsl_F
 */

/**
 * Интерфейс слоя обучаемого по алгоритму обратного распространения ошибки
 */
public interface BackpropagationLayer extends Layer {
    /**
     * Придает случайные значения весам нейронов
     *
     * @param min Минимальное значение
     * @param max Максимальное значение
     */
    void randomize(float min, float max);

    /**
     * Выичисляет следующий вектор ошибки в обратном направлении
     *
     * @param input Входной вектор
     * @param error Вектор ошибки
     * @return Следующий вектор ошибки в обратном направлении
     */
    float[] computeBackwardError(float[] input, float[] error);

    /**
     * Подгоняет веса нейронов в сторону уменьшения ошибки
     *
     * @param input    Входной вектор
     * @param error    Вектор ошибки
     * @param rate     Скорость обучения
     * @param momentum Моментум
     */
    void adjust(float[] input, float[] error, float rate, float momentum);
}