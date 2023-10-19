package tech.realib.pv201.ngindu.bank.entity;

public class BankOffice{
    private Integer id;
    private String name;
    private Bank bank;
    private String address;
    private Boolean status;
    private Boolean maySetATM;
    private Integer countATM;
    private Boolean mayApplyCredit;
    private Boolean mayWithdrawMoney;
    private Boolean mayDepositMoney;
    private Double money;
    private Double rentCost;

    public BankOffice( Integer id, String name, String address, Boolean status,
                       Double rentCost) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.status = status;
        this.maySetATM = true;
        this.countATM = 0;
        this.mayDepositMoney = true;
        this.mayApplyCredit = true;
        this.mayWithdrawMoney = true;
        this.money = 0.0D;
        this.rentCost = rentCost;
    }


    @Override
    public String toString() {
        String str =  "Nome do Escritório: " + name +
                "\nBanco: " + bank.getName() +
                "\nEndereço : " + address +
                "\nEstatuto: ";
        if (status){
            str+= "funciona";
        }
        else{
            str+= "Não funciona";
        }
        if (maySetATM){
            str += "\nМPode colocar caixas eletrônicos";
        }
        else{
            str += "\nNão é possível colocar caixas eletrônicos";
        }

        if (maySetATM){
            str += "\nNúmero de caixas eletrônicos: " + countATM;
        }

        if (mayWithdrawMoney){
            str += "\nTrabalha para a emissão de dinheiro";
        }
        else{
            str += "\nNão trabalha para a emissão de dinheiro";
        }

        if (mayDepositMoney){
            str += "\nVocê pode depositar dinheiro";
        }
        else{
            str += "\nNão é possível depositar dinheiro";
        }
        str += "\nValor monetário: " + money +
                "\nRenda: " + rentCost;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getMaySetATM() {
        return maySetATM;
    }

    public void setMaySetATM(Boolean maySetATM) {
        this.maySetATM = maySetATM;
    }

    public Integer getCountATM() {
        return countATM;
    }

    public void setCountATM(Integer countATM) {
        this.countATM = countATM;
    }

    public Boolean getMayApplyCredit() {
        return mayApplyCredit;
    }

    public void setMayApplyCredit(Boolean mayApplyCredit) {
        this.mayApplyCredit = mayApplyCredit;
    }

    public Boolean getMayWithdrawMoney() {
        return mayWithdrawMoney;
    }

    public void setMayWithdrawMoney(Boolean mayWithdrawMoney) {
        this.mayWithdrawMoney = mayWithdrawMoney;
    }

    public Boolean getMayDepositMoney() {
        return mayDepositMoney;
    }

    public void setMayDepositMoney(Boolean mayDepositMoney) {
        this.mayDepositMoney = mayDepositMoney;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getRentCost() {
        return rentCost;
    }

    public void setRentCost(Double rentCost) {
        this.rentCost = rentCost;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
