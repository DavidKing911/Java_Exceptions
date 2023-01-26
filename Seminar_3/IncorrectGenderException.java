package Seminar_3;

public class IncorrectGenderException extends RuntimeException {
    public IncorrectGenderException() {
        super("Некорректно заполнено поле пол");
    }
}