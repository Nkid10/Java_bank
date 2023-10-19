package tech.realib.pv201.ngindu.bank.service;

import tech.realib.pv201.ngindu.bank.entity.Bank;

public interface BankService {
    /* Adicionar dinheiro ao banco*/
    void addMoney(Bank bank, Double sumMoney);
    /* Dedução do dinheiro do banco*/
    Boolean subtractMoney(Bank bank, Double sumMoney);
}