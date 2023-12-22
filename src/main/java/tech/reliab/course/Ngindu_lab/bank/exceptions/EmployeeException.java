package tech.reliab.course.Ngindu_lab.bank.exceptions;

public class EmployeeException extends RuntimeException {
    public EmployeeException(String errorMessage, int employeeId) {
        super("Ошибка! Сотрудник с id=" + employeeId + ". " + errorMessage);
    }

}
