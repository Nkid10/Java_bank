package tech.realib.pv201.ngindu.bank.service;

import tech.realib.pv201.ngindu.bank.entity.BankATM;

public interface AtmService {
/* Adicionar uma quantia de dinheiro ao caixa eletrônico e, consequentemente, adicionar uma quantia de dinheiro ao escritório do banco
     * e para o banco ao qual o Caixa eletrônico pertence, levando em conta se o Caixa eletrônico está funcionando. Se ele
     * funciona, em seguida, o dinheiro é depositado e reembolsado true, caso contrário false*/
    Boolean addMoney(BankATM bankATM, Double sumMoney);

   /*Dedução da quantidade de dinheiro do Caixa eletrônico e, consequentemente, dedução da quantidade de dinheiro do escritório do banco e do banco,
            * ao qual o Caixa eletrônico pertence, verificando se há dinheiro suficiente no caixa eletrônico para deduzi-lo.
* * Se não for suficiente, retornará false, caso contrário, true. Tendo em conta se a máquina funciona ou não
    ele tem dinheiro. Se funcionar e tiver dinheiro, o dinheiro será deduzido e retornado true, caso contrário false*/
    Boolean subtractMoney(BankATM bankATM, Double sumMoney);

   /* Amarre o Caixa eletrônico ao banco.*/
            ////////void linkBank(BankATM bankam, Bank tech.realib.pv201.ngindu.bank);
            /* Ligar o Caixa eletrônico ao escritório.*/
            ////void link Back Office(Bank ATM tech.realib.pv201.ngindu.bank ATM, Bank Office back Office);

            /* Ligar o Caixa eletrônico ao funcionário.*/
    ////void link Bank Office(Bank ATM tech.realib.pv201.ngindu.bank ATM, Employee employee);
}