package tech.realib.pv201.ngindu.bank.service;

import tech.realib.pv201.ngindu.bank.entity.Employee;

public interface EmployeeService {
   /* Envio do trabalhador para o trabalho remoto*/
    void toDistantWork(Employee employee);
    /* Envio do trabalhador para o trabalho no escritório*/
    void toOfficeWork(Employee employee);

   /* Permitir / negar a emissão de créditos*/
    void permissionForCredit(Employee employee, Boolean flag);
}
