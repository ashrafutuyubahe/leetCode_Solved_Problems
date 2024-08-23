package com.example.demo;

public class BankAccount {
    private int accountNumber=12;
    private  int accountBalance=0;


    public BankAccount(int accountBalance, int accountNumber){
         this.accountBalance= accountBalance;
         this.accountNumber= accountNumber;
    }



    public int DepositMoney(int amount){

        this.accountBalance += amount;
        return accountBalance;
    }

    public int WithdrawMoney(int amount){
    if(amount>this.accountBalance){

        System.out.println("you don't have enough money");
    } else{

        int newBalance= this.accountBalance- amount;
        this.accountBalance= newBalance;
        return amount;
    }

    return 0;

    }
public  int checkBalance(){
        return this.accountBalance;
}


}
