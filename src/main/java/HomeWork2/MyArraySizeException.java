package HomeWork2;

public class MyArraySizeException extends Exception{
    public MyArraySizeException(int size) {
        super(String.format("�� ������� ������ �������� %d * %d, ������� ������ ������� 4*4", size, size));
    }
}
