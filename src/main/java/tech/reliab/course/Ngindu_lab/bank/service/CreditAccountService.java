package tech.reliab.course.Ngindu_lab.bank.service;

import tech.reliab.course.Ngindu_lab.bank.entity.*;

import java.time.LocalDate;

public interface CreditAccountService {
    CreditAccount create(User user, Bank bank, LocalDate startDate, LocalDate endDate, int monthsCount, double creditAmount, double monthlyPayment, double interestRate, Employee bankEmployee, PaymentAccount paymentAccount);

    void delete(CreditAccount account);

    boolean makeMonthlyPayment(CreditAccount account);
}