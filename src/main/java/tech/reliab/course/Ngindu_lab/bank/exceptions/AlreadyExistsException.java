package tech.reliab.course.Ngindu_lab.bank.exceptions;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String entityName, int entityId) {
        super("Ошибка! " + entityName + " id=" + entityId + " уже существует");
    }
}
