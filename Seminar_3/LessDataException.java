package Seminar_3;

public class LessDataException extends RuntimeException {
    public LessDataException() {
        super("Введено меньше данных, чем нужно");
    }
}