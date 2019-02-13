package core1;

public class DynamicGenericArray <T> {
    private Object[] array;
    private int currLength;

    public DynamicGenericArray(int length) {
        array = new Object[length];
        currLength = 0;
    }

    public DynamicGenericArray() {
        this(10);
    }

    public T get(int i) {
        return (T)array[i];
    }

    public void add(T e) {
        array[currLength] = e;
        if (++currLength == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public void remove(int i) {
        System.arraycopy(array, i, array, i + 1, currLength - i - 1);
        currLength--;
        if (currLength <= array.length / 2) {
            Object[] newArray = new Object[currLength];
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
