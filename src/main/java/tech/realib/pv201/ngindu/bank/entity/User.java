package tech.realib.pv201.ngindu.bank.entity;

import java.util.Date;
import java.util.Random;

import tech.realib.pv201.ngindu.bank.entity.common.Person;
import tech.realib.pv201.ngindu.bank.utils.FullName;

public class User extends Person {
    private String work;
    private Double monthSalary;

    private Bank bank;
    private CreditAccount creditAccount;
    private PaymentAccount paymentAccount;
    private Integer creditRating;

    public User(Integer id, FullName name, Date birthday, String work) {
        super(id,name,birthday);
        this.setWork(work);
        Random random = new Random();
        this.setMonthSalary(random.nextDouble(1, 10000));
        int creditRating = 0;
        Integer startRat = 0;
        Integer endRat = 1000;
        while ((startRat != 10000) && (creditRating == 0)) {
            if ((getMonthSalary() <= endRat) && (getMonthSalary() >= startRat))
                creditRating = endRat / 10;
            else {
                startRat += 1000;
                endRat += 1000;
            }
        }
        this.creditRating = creditRating;
        this.bank = null;
        this.paymentAccount =null;
        this.creditAccount = null;
    }


    @Override
    public String toString() {
        String str =  "Nome: " + name.toString() +
                "\nData de nascimento: " + birthday +
                "\nTrabalha: " + work +
                "\nBanco: " + bank +
                "\nSalario: " + monthSalary;
        if (bank == null){
            str += "\nBanco: vazio";
        }
        else {
            str += "\nBanco: " + bank.getName();
        }

        if (creditAccount == null){
            str += "\nConta de crédito: vazio";
        }
        else {
            str += "\nConta de crédito: " + creditAccount.getId();
        }

        if (paymentAccount == null){
            str += "\nConta de pagamento: vazio";
        }
        else {
            str += "\nConta de pagamento: " + paymentAccount.getId();
        }
        str += "\nClassificação de crédito: " + creditRating;
        return str;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(Double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public Integer getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }
}
