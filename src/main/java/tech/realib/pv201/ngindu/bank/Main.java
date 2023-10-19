package tech.realib.pv201.ngindu.bank;

import tech.realib.pv201.ngindu.bank.entity.*;
import tech.realib.pv201.ngindu.bank.service.impl.*;
import tech.realib.pv201.ngindu.bank.utils.FullName;
import tech.realib.pv201.ngindu.bank.utils.StatusATM;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Bank
        Bank bank = new Bank(1, "Bpc");
        BankServiceImpl bankService = new BankServiceImpl();
        bankService.addMoney(bank,90000.0);
        bankService.subtractMoney(bank,519.0);


        //Bank Office
        BankOffice office = new BankOffice( 1, "office_name", "adress",true, 500.0);
        BankOfficeServiceImpl bankOfficeService = new BankOfficeServiceImpl();
        office.setBank(bank);
        bank.setCountOffice(bank.getCountOffice() + 1);
        bankOfficeService.addMoney(office, 1000.0);

        //BankAtm
        BankATM atm = new BankATM(1, "ATM_1", StatusATM.Work, Boolean.TRUE, Boolean.TRUE,
                500.0);
        AtmServiceImpl atmService = new AtmServiceImpl();

        bankOfficeService.addATM(office,atm);

        atmService.addMoney(atm, 1000.0);
        //atm.setBank(tech.realib.pv201.ngindu.bank);
        bankOfficeService.addATM(office, atm);


        //Employee
        Employee employee = new Employee(1, new FullName("Philipe", "Mendes"),
                new Date(19081917), bank, "job1", 10000.0, office );
        bank.setCountEmployees(bank.getCountEmployees() + 1);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.toDistantWork(employee);
        atm.setEmployee(employee);

        //User
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User( 1, new FullName("Allan", "Sergio"), new Date(10112000),
                "Trabalho01");
        user.setBank(bank);
        bank.setCountClients(bank.getCountClients() + 1);
        userService.changeWork(user, "Trabalho02", 7000.0);

        //Payment Account
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        PaymentAccount payAcc = new PaymentAccount(1, user, bank);
        paymentAccountService.addMoney(payAcc, 4500.0);

        //Credit Account
        CreditAccount creditAcc = new CreditAccount(1,user, bank, employee, payAcc, LocalDate.of(2023,11,12),
                12, 200.0);
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();
        if (creditAccountService.applyLoan(creditAcc, employee))
            System.out.println("Autorizado a obter crédito");
        else System.out.println("Não foi possível obter crédito");

        user.setCreditAccount(creditAcc);
        user.setPaymentAccount(payAcc);


        System.out.println("\nBanco:");
        System.out.println(bank.toString());

        System.out.println("\nEscritório bancário:");
        System.out.println(office.toString());

        System.out.println("\nMultibanco:");
        System.out.println(atm.toString());

        System.out.println("\nFuncionário:");
        System.out.println(employee.toString());

        System.out.println("\nConta de pagamento:");
        System.out.println(payAcc.toString());

        System.out.println("\nConta de crédito:");
        System.out.println(creditAcc.toString());

        System.out.println("\nUsuário:");
        System.out.println(user.toString());
    }

}