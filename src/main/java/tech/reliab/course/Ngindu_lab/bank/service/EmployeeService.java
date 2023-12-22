package tech.reliab.course.Ngindu_lab.bank.service;

import tech.reliab.course.Ngindu_lab.bank.entity.Bank;
import tech.reliab.course.Ngindu_lab.bank.entity.BankOffice;
import tech.reliab.course.Ngindu_lab.bank.entity.Employee;
import tech.reliab.course.Ngindu_lab.bank.enums.JobName;

import java.time.LocalDate;

public interface EmployeeService {
    Employee create(String fcs, LocalDate birthday, JobName jobName, Bank bank, boolean isWorkingAtHome, BankOffice bankOffice, boolean canWithdrawCredit, double salaryAmount);

    void delete(Employee employee);
}