package tech.realib.pv201.ngindu.bank.entity;

import java.util.Random;

public class Bank {
    private Integer id;
    private String name;
    private Integer countOffice;
    private Integer countATM;
    private Integer countEmployees;
    private Integer countClients;
    private Integer rating;
    private Double money;
    private Double interestRate;

    public Bank(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.countOffice = 0;
        this.countATM = 0;
        this.countEmployees = 0;
        this.countClients = 0;
        Random random = new Random();
        this.rating = random.nextInt(0, 100);
        this.money = random.nextDouble(0, 1000000);
        this.interestRate = 20.0- this.getRating() /5.0;;
    }

    @Override
    public String toString(){
        return "Nome do banco: " + name +
                "\nNúmero de escritórios: " + countOffice +
                "\nNúmero de caixas eletrônicos: " + countATM +
                "\nNúmero de funcionários: " +countEmployees +
                "\nNúmero de clientes: " + countClients +
                "\nClassificação: " + rating +
                "\nValor monetário: " + money +
                "\nTaxa de juros: " + interestRate;
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

    public Integer getCountOffice() {
        return countOffice;
    }

    public void setCountOffice(Integer countOffice) {
        this.countOffice = countOffice;
    }

    public Integer getCountATM() {
        return countATM;
    }

    public void setCountATM(Integer countATMBank) {
        this.countATM = countATMBank;
    }

    public Integer getCountEmployees() {
        return countEmployees;
    }

    public void setCountEmployees(Integer countEmployees) {
        this.countEmployees = countEmployees;
    }

    public Integer getCountClients() {
        return countClients;
    }

    public void setCountClients(Integer countClients) {
        this.countClients = countClients;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}