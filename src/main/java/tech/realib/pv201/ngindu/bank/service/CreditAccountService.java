package tech.realib.pv201.ngindu.bank.service;

import tech.realib.pv201.ngindu.bank.entity.CreditAccount;
import tech.realib.pv201.ngindu.bank.entity.Employee;

public interface CreditAccountService {
   /* Aprovação do pedido de empréstimo. Se aprovado, se o funcionário selecionado coincidir com o funcionário,
            * a emissão efetiva de um empréstimo, se o banco tiver um valor suficiente para emitir o empréstimo e se o
     * o funcionário pode emitir empréstimos, Então o valor solicitado é recebido na conta de pagamento do Usuário e
     * o montante indicado no pedido é debitado do banco. Em caso de registro, True é retornado, caso contrário, false.*/
    Boolean applyLoan(CreditAccount creditAcc, Employee employee);
}
