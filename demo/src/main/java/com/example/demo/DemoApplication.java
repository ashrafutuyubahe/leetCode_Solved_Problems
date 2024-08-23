package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static  void main(String[]  args){

		SpringApplication.run(DemoApplication.class,args);

		Car newCar= new Car("tesla",2024,"mercedes");

//		newCar.setCarModel("foden");
//		System.out.println(newCar.getCarModel());

		BankAccount bankAccount= new BankAccount(1200,12);

		System.out.println(bankAccount.checkBalance());
		System.out.println(bankAccount.DepositMoney(2000));;
		System.out.println(bankAccount.checkBalance());
		System.out.println(bankAccount.WithdrawMoney(2000));;








	}




}
