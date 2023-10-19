package tech.realib.pv201.ngindu.bank.service.impl;

import tech.realib.pv201.ngindu.bank.entity.Employee;
import tech.realib.pv201.ngindu.bank.entity.CreditAccount;
import tech.realib.pv201.ngindu.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {

    @Override
    public Boolean applyLoan(CreditAccount creditAcc, Employee employee ) {
        if ((creditAcc.getAmount() > creditAcc.getBank().getMoney()) || (!employee.getCanLend()))
            return Boolean.FALSE;
        creditAcc.setEmployee(employee);
        creditAcc.getBank().setMoney(creditAcc.getBank().getMoney() - creditAcc.getAmount());
        return Boolean.TRUE;
    }
}
