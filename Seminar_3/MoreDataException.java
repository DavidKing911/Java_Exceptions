package Seminar_3;

public class MoreDataException extends RuntimeException  {
    public MoreDataException() {
        super("Введено больше данных, чем нужно");
    }
}