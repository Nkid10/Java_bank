package tech.realib.pv201.ngindu.bank.service;

import tech.realib.pv201.ngindu.bank.entity.BankATM;
import tech.realib.pv201.ngindu.bank.entity.BankOffice;

public interface BankOfficeService {
    /* Adicionar uma quantia de dinheiro ao escritório e, consequentemente, adicionar uma quantia de dinheiro ao banco,
    a quem pertence o escritório*/
    void addMoney(BankOffice office, Double sumMoney);
    /* Dedução da quantia de dinheiro do Escritório e, consequentemente, dedução da quantidade de dinheiro do banco ao qual pertence
     * este escritório, com a verificação de se há dinheiro suficiente no escritório para deduzi-lo. Se não for suficiente,
            * retorna false, caso contrário true*/
    Boolean subtractMoney(BankOffice office, Double sumMoney);

    /* Adicionar um novo Caixa eletrônico ao escritório e, consequentemente, adicionar um novo Caixa eletrônico ao banco que
     * pertence a este escritório, verificando se um novo Caixa eletrônico pode ser adicionado a este escritório.
     * Se não for suficiente, retorne false, caso contrário, true*/
    Boolean addATM(BankOffice office, BankATM bankATM);

   /* Subtração do Caixa eletrônico do Escritório e, consequentemente, subtração do Caixa eletrônico do banco ao qual
     * pertence a este escritório, se o Caixa eletrônico especificado pertence ao escritório*/
    Boolean subtractATM(BankOffice office, BankATM bankATM);
}