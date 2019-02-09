package core1;


import java.util.Arrays;

public class DynamicDoubleArray {
    private double[] array;
    private int currLength;

    public DynamicDoubleArray(int length) {
        array = new double[length];
        currLength = 0;
    }

    public DynamicDoubleArray() {
        this(10);
    }

    public double get(int i) {
        return array[i];
    }

    public void add(double e) {
        array[currLength] = e;
        if (++currLength == array.length) {
            resize();
        }
    }

    private void resize() {
        double[] newArray = new double[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
