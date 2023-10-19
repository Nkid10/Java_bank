package tech.realib.pv201.ngindu.bank.entity;

import tech.realib.pv201.ngindu.bank.entity.common.Account;

import java.time.LocalDate;

public class CreditAccount extends Account {
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer countMonth;
    private Double amount;
    private Double mountsPayment;

    private Double interestRate;
    private Employee employee;
    private PaymentAccount paymentAccount;

    public CreditAccount(Integer id, User user, Bank bank, Employee employee, PaymentAccount paymentAccount,
                         LocalDate startDate, Integer countMonth, Double amount ) {
        super(id,user,bank);
        this.startDate = startDate;
        this.countMonth = countMonth;
        this.endDate = startDate.plusMonths(this.countMonth);
        this.amount = amount;
        this.interestRate = bank.getInterestRate();
        this.mountsPayment = (1+ interestRate/100)*amount/countMonth;
        this.employee = employee;
        this.paymentAccount = paymentAccount;
    }

    @Override
    public String toString() {
        String str =  "Банк: " + bank.getName() +
                "\nПользователь: " + user.getName().toString() +
                "\nКоличество месяцев: " + countMonth +
                "\nПромежутки: " + startDate.toString() + " - " + endDate.toString() +
                "\nСумма кредита: " + amount +
                "\nПроцентная ставка: " + interestRate + "%" +
                "\nЕжемесячный платёж: " + countMonth +
                "\nСотрудник, который выдал кредит: " + employee.getName().toString()+
                "\nId платёжного счёта: " + paymentAccount.getId().toString();
        return str;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getCountMonth() {
        return countMonth;
    }

    public void setCountMonth(Integer countMonth) {
        this.countMonth = countMonth;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getMountsPayment() {
        return mountsPayment;
    }

    public void setMountsPayment(Double mountsPayment) {
        this.mountsPayment = mountsPayment;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }
}
