package tech.realib.pv201.ngindu.bank.entity;

import tech.realib.pv201.ngindu.bank.entity.common.Account;

public class PaymentAccount extends Account {
   private Double sum;

    public PaymentAccount(Integer id, User user, Bank bank) {
        super(id,user,bank);
        this.setSum(0.0D);
    }

    @Override
    public String toString() {
        String str =  "Banco: " + bank.getName() +
                "\nUsuario: " + user.getName().toString() +
                "\nSoma do dinheiro: " + sum;
        return str;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
