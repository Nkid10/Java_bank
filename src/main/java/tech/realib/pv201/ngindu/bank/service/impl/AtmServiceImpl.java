package tech.realib.pv201.ngindu.bank.service.impl;

import tech.realib.pv201.ngindu.bank.entity.BankATM;
import tech.realib.pv201.ngindu.bank.service.AtmService;
import tech.realib.pv201.ngindu.bank.utils.StatusATM;

import java.util.Objects;

public class AtmServiceImpl implements AtmService {

    @Override
    public Boolean addMoney(BankATM bankATM, Double sumMoney) {
        if (!Objects.equals(bankATM.getStatus(), StatusATM.Work)) {
            return Boolean.FALSE;
        }
        bankATM.setMoney(bankATM.getMoney() + sumMoney);
        bankATM.getBankOffice().setMoney(bankATM.getBankOffice().getMoney() + sumMoney);
        bankATM.getBank().setMoney( bankATM.getBank().getMoney() + sumMoney);
        return Boolean.TRUE;
    }


    @Override
    public Boolean subtractMoney(BankATM bankATM, Double sumMoney) {
        if ((Objects.equals(bankATM.getStatus(), StatusATM.NotWork)) || (Objects.equals(bankATM.getStatus(),
                StatusATM.NoMoney)) || (bankATM.getMoney() < sumMoney))
            return Boolean.FALSE;
        if (Objects.equals(bankATM.getMoney(), sumMoney))
            bankATM.setStatus(StatusATM.NoMoney);
        bankATM.setMoney(bankATM.getMoney() - sumMoney);
        bankATM.getBankOffice().setMoney(bankATM.getBankOffice().getMoney() - sumMoney);
        bankATM.getBank().setMoney( bankATM.getBank().getMoney() - sumMoney);
        return Boolean.TRUE;
    }
}
