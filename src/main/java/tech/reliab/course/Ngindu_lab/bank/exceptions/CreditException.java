package tech.reliab.course.Ngindu_lab.bank.exceptions;

public class CreditException extends RuntimeException {
    public CreditException(String errorMessage) {
        super("Ошибка! Отказ в выдаче кредита. " + errorMessage);
    }
}
