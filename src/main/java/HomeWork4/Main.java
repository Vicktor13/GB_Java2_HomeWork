package HomeWork4;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF_SIZE = SIZE / 2;
    public static void main(String[] args) {
        float[] array1 = new float[SIZE];
        float[] array2 = new float[SIZE];
        array1 = first();
        array2 = second();
        System.out.println(Arrays.equals(array1, array2));
    }

    public static float[] first() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        return arr;
        }

        public static float[] second() {
            float[] arr = new float[SIZE];
            float[] arr1 = new float[HALF_SIZE];
            float[] arr2 = new float[HALF_SIZE];
            for (int i = 0; i < SIZE; i++) {
                arr[i] = 1;
            }
            long startTime = System.currentTimeMillis();
            System.arraycopy(arr, 0, arr1, 0, HALF_SIZE);
            System.arraycopy(arr, HALF_SIZE, arr2, 0, HALF_SIZE);

            Thread firstHalf = new Thread(() -> {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            });

            Thread secondHalf = new Thread(() -> {
                for (int i = 0; i < arr2.length; i++) {
                    int j = i + HALF_SIZE;
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
                }
            });

            firstHalf.start();
            secondHalf.start();
            try {
                firstHalf.join();
                secondHalf.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.arraycopy(arr1, 0, arr, 0, HALF_SIZE);
            System.arraycopy(arr2, 0, arr, HALF_SIZE, HALF_SIZE);

            System.out.println(System.currentTimeMillis() - startTime);
            return arr;
        }
}







