package Lesson2Dz;

public class MyArrayDataException extends MyException {
    public MyArrayDataException(int row, int column) {
        super(String.format("Неправильный формат [%][%]", row+1, column+1));
    }
}
