package core1;

public class HelloWorld {

    public static void main(String[] args) {
//        DynamicDoubleArray array = new DynamicDoubleArray(3);
        DynamicGenericArray<Double> array = new DynamicGenericArray<>();
        array.add(2.0);
        array.add(2.0);
        array.add(2.0);
        array.add(2.0);
        array.add(2.0);
        array.add(2.0);
        array.remove(3);



        System.out.println(array);
    }
}
