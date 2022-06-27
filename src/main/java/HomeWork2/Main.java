package HomeWork2;

import java.util.Arrays;
import java.util.Random;


public class Main {
    private static final int NECESSARY_SIZE = 4;
    private static final Random random = new Random();

    public static void main(String[] args) throws MyArrayDataException {
        String[][] strings;
        int size = random.nextInt(3,5);
        strings = new String[size][size];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                strings[i][j] = String.valueOf(random.nextInt(20));
            }
        }
        if (random.nextBoolean()){
            strings[0][0] = "test";

        }


        try {
            CheckSum(strings);
            if (strings.length != NECESSARY_SIZE) {
                throw new MyArraySizeException(size);
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        for (String[] string : strings) {
            System.out.println(Arrays.toString(string));
        }
        System.out.println(CheckSum(strings));

    }

    private static int CheckSum(String[][] strings) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }

        }
        return sum;
    }
}
