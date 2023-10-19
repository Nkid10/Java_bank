package tech.realib.pv201.ngindu.bank.entity.common;

import tech.realib.pv201.ngindu.bank.entity.Bank;
import tech.realib.pv201.ngindu.bank.entity.User;

abstract public class Account {
    protected Integer id;
    protected User user;
    protected Bank bank;

    public Account(Integer id, User user, Bank bank){
        this.id = id;
        this.user = user;
        this.bank = bank;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
