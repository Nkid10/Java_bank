package tech.reliab.course.Ngindu_lab.bank.service.impl;

import tech.reliab.course.Ngindu_lab.bank.entity.Bank;
import tech.reliab.course.Ngindu_lab.bank.entity.BankAtm;
import tech.reliab.course.Ngindu_lab.bank.entity.BankOffice;
import tech.reliab.course.Ngindu_lab.bank.entity.Employee;
import tech.reliab.course.Ngindu_lab.bank.service.BankOfficeService;

import java.util.ArrayList;

public class BankOfficeServiceImpl implements BankOfficeService {
    @Override
    public BankOffice create(String name, String address, boolean isWorking, boolean isPossibleToPlaceAtm, boolean isCreditAvailable, boolean isMoneyWithdrawAvailable, boolean isDepositMoneyAvailable, double moneyAmount, double rentPrice, Bank bank) {
        return new BankOffice(name, address, isWorking, isPossibleToPlaceAtm, isCreditAvailable, isMoneyWithdrawAvailable, isDepositMoneyAvailable, moneyAmount, rentPrice, bank);
    }

    @Override
    public void delete(BankOffice bankOffice) {
        bankOffice.setName("");
        bankOffice.setAddress("");
        bankOffice.setWorking(false);
        bankOffice.setPossibleToPlaceAtm(false);
        bankOffice.setCreditAvailable(false);
        bankOffice.setMoneyWithdrawAvailable(false);
        bankOffice.setDepositMoneyAvailable(false);
        bankOffice.setMoneyAmount(0);
        bankOffice.setRentPrice(0);
    }

    @Override
    public boolean addAtm(BankOffice bankOffice, BankAtm atm) {
        if (bankOffice == null || atm == null) {
            System.out.println("Ошибка! не существует офиса банка или банкомата");
            return false;
        }

        if (!bankOffice.isPossibleToPlaceAtm()) {
            System.out.println("Ошибка! невозможно разместить банкомат в офисе банка.");
            return false;
        }

        if (bankOffice.getBank() == null) {
            System.out.println("Ошибка! офис не принадлежит ни одному банку.");
            return false;
        }

        ArrayList<BankAtm> bankAtms = bankOffice.getBankAtms();
        if (bankAtms == null)
            bankAtms = new ArrayList<>();

        bankAtms.add(atm);
        bankOffice.setBankAtms(bankAtms);

        atm.setBankOffice(bankOffice);
        atm.setAddress(bankOffice.getAddress());

        return true;
    }

    @Override
    public boolean deleteAtm(BankOffice bankOffice, BankAtm atm) {
        if (bankOffice == null || atm == null) {
            System.out.println("Ошибка! не существует офиса банка или банкомата");
            return false;
        }

        if (bankOffice.getBankAtms() == null || bankOffice.getBankAtms().isEmpty()) {
            System.out.println("Ошибка! невозможно убрать банкомат, потому что в офисе больше нет банкоматов");
            return false;
        }

        ArrayList<BankAtm> bankAtms = bankOffice.getBankAtms();
        bankAtms.remove(atm);
        if (bankAtms.isEmpty())
            bankOffice.setBankAtms(null);
        else
            bankOffice.setBankAtms(bankAtms);

        atm.setBankOffice(null);

        return true;
    }

    @Override
    public boolean addEmployee(BankOffice bankOffice, Employee employee) {
        if (bankOffice == null || employee == null) {
            System.out.println("Ошибка! не существует офиса банка или сотрудника банка");
            return false;
        }

        ArrayList<Employee> employees = bankOffice.getEmployees();
        if (employees == null)
            employees = new ArrayList<>();

        employees.add(employee);
        bankOffice.setEmployees(employees);

        employee.setWorkingAtHome(false);
        employee.setBankOffice(bankOffice);
        employee.setBank(bankOffice.getBank());

        return true;
    }

    @Override
    public boolean deleteEmployee(BankOffice bankOffice, Employee employee) {
        if (bankOffice == null || employee == null) {
            System.out.println("Ошибка! не существует офиса банка или сотрудника банка");
            return false;
        }

        ArrayList<Employee> employees = bankOffice.getEmployees();
        employees.remove(employee);

        if (employees.isEmpty())
            bankOffice.setEmployees(null);
        else
            bankOffice.setEmployees(employees);

        employee.setWorkingAtHome(true);
        employee.setBankOffice(bankOffice);

        return true;
    }

    @Override
    public boolean depositMoney(BankOffice bankOffice, double moneyAmount) {
        if (bankOffice == null) {
            System.out.println("Ошибка! Офис банка не существует");
            return false;
        }

        if (!bankOffice.isDepositMoneyAvailable()) {
            System.out.println("Ошибка! невозможно внести сумму на счет");
            return false;
        }

        bankOffice.setMoneyAmount(bankOffice.getMoneyAmount() + moneyAmount);
        bankOffice.getBank().setTotalAmountMoney(bankOffice.getBank().getTotalAmountMoney() + moneyAmount);

        return true;
    }

    @Override
    public boolean withdrawMoney(BankOffice bankOffice, double moneyAmount) {
        if (bankOffice == null) {
            System.out.println("Ошибка! Офис банка не существует");
            return false;
        }

        if (!bankOffice.isMoneyWithdrawAvailable()) {
            System.out.println("Ошибка! невозможно снять сумму с банкомата");
            return false;
        }

        if (bankOffice.getMoneyAmount() < moneyAmount) {
            System.out.println("Ошибка! сумма денег в офисе недостаточно для выдачи");
            return false;
        }

        bankOffice.setMoneyAmount(bankOffice.getMoneyAmount() - moneyAmount);
        bankOffice.getBank().setTotalAmountMoney(bankOffice.getBank().getTotalAmountMoney() - moneyAmount);

        return true;
    }
}