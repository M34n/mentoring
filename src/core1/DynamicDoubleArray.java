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
            double[] newArray = new double[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public void remove(int i) {
        System.arraycopy(array, i, array, i + 1, currLength - i - 1);
        currLength--;
        if (currLength <= array.length / 2) {
            double[] newArray = new double[currLength];
            System.arraycopy(array, 0, newArray, 0, currLength);
            array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < currLength; i++) {
            stringBuilder.append(array[i]);
            if (i != currLength - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
