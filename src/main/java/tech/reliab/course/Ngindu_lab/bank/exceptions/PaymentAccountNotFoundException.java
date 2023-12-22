package tech.reliab.course.Ngindu_lab.bank.exceptions;

public class PaymentAccountNotFoundException extends RuntimeException {
    public PaymentAccountNotFoundException() {
        super("Ошибка! Платёжный аккаунт не найден");
    }

}
