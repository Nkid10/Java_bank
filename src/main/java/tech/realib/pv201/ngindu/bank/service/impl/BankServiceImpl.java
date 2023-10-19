package tech.realib.pv201.ngindu.bank.service.impl;

import tech.realib.pv201.ngindu.bank.entity.Bank;
import tech.realib.pv201.ngindu.bank.service.BankService;

public class BankServiceImpl implements BankService {
    @Override
    public void addMoney(Bank bank, Double sumMoney) {
        Double sum = bank.getMoney();
        bank.setMoney(sum + sumMoney);
    }

    @Override
    public Boolean subtractMoney(Bank bank, Double sumMoney) {
        Double sum = bank.getMoney();
        if (sumMoney > sum)
            return Boolean.FALSE;
        bank.setMoney(sum - sumMoney);
        return Boolean.TRUE;
    }
}
