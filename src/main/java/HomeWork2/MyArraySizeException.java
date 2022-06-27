package HomeWork2;

public class MyArraySizeException extends Exception{
    public MyArraySizeException(int size) {
        super(String.format("Вы выбрали массив размером %d * %d, укажите размер массива 4*4", size, size));
    }
}
