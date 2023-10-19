package tech.realib.pv201.ngindu.bank.service;

import tech.realib.pv201.ngindu.bank.entity.User;

public interface UserService {
    /* Mudança de emprego pelo Usuário e, consequentemente, salário e recálculo de sua classificação de crédito*/
    void changeWork(User user, String newWork, Double newMonthSalary);
}
