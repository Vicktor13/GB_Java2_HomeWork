package HomeWork2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int column) {
        super(String.format("� ������ [%d][%d] �������� ������ ������", row, column));
    }
}
