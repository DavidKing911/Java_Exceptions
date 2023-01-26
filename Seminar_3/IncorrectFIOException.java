package Seminar_3;

public class IncorrectFIOException extends RuntimeException  {
    public IncorrectFIOException() {
        super("Некорректно заполнено поле ФИО");
    }
}