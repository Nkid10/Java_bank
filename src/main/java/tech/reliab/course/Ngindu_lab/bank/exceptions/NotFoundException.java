package tech.reliab.course.Ngindu_lab.bank.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String entityName) {
        super("Ошибка! " + entityName + " не найден или не существует");
    }
}
