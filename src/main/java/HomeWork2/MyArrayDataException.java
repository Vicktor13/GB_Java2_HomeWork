package HomeWork2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int column) {
        super(String.format("В ячейке [%d][%d] неверный формат данных", row, column));
    }
}
