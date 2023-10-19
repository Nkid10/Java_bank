package tech.realib.pv201.ngindu.bank.entity;

import tech.realib.pv201.ngindu.bank.utils.StatusATM;

public class BankATM {
    private Integer id;
    private String name;
    private BankOffice bankOffice;
    private StatusATM status;
    private Bank bank;
    private  Employee employee;
    private Boolean canPayMoney;
    private Boolean canDepositMoney;
    private Double money;
    private Double maintenanceCost;


    public BankATM(Integer id, String name, StatusATM status, Boolean canPayMoney,
                   Boolean canDepositMoney, Double maintenanceCost) {

        this.id = id;
        this.name = name;
        this.status = status;
        this.canPayMoney = canPayMoney;
        this.canDepositMoney = canDepositMoney;
        this.maintenanceCost = maintenanceCost;
        this.bank = null;
        this.employee = null;
        this.money = 0.0D;
        this.bankOffice = null;
    }

    @Override
    public String toString(){
        String str =  "Nome do Caixa eletrônico: " + name +
                        "\nEndereço: " + bankOffice.getAddress() +
                        "\nEstatuto: ";
        switch (status){
            case Work-> str += "funciona";
            case NotWork-> str += "Não funciona";
            case NoMoney-> str += "Sem dinheiro";
        }
        str += "\nEmpregado de serviço: " + employee.getName().toString();
        if (canPayMoney){
            str += "\nTrabalha para a emissão de dinheiro";
        }
        else{
            str += "\nNão trabalha para a emissão de dinheiro";
        }
        if (canDepositMoney){
            str += "\nVocê pode depositar dinheiro";
        }
        else{
            str += "\nNão é possível depositar dinheiro";
        }
        str += "\nValor monetário: " + money +
                "\nCusto de manutenção: " + maintenanceCost;
        return str;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public StatusATM getStatus() {
        return status;
    }

    public void setStatus(StatusATM status) {
        this.status = status;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Boolean getCanPayMoney() {
        return canPayMoney;
    }

    public void setCanPayMoney(Boolean canPayMoney) {
        this.canPayMoney = canPayMoney;
    }

    public Boolean getCanDepositMoney() {
        return canDepositMoney;
    }

    public void setCanDepositMoney(Boolean canDepositMoney) {
        this.canDepositMoney = canDepositMoney;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(Double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }
}
