package tech.realib.pv201.ngindu.bank.service;

import tech.realib.pv201.ngindu.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    /* Adicionar dinheiro à conta de pagamento*/
    void addMoney(PaymentAccount payAcc, Double sumMoney);
    /* Dedução da quantia de dinheiro da conta de pagamento*/
    Boolean subtractMoney(PaymentAccount payAcc, Double sumMoney);
}
