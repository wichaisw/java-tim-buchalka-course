package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        BankAccount myAccount = new BankAccount();
//        BankAccount myAccount = new BankAccount(165749, 5000,
//                "Tim", "tim@bulchaka.com", "(087) 133-0187");
//        myAccount.setAccountNumber(165749);
//        myAccount.setCustomerName("Tim");
//        myAccount.setEmail("tim@bulchaka.com");
//        myAccount.setPhoneNumber("(087) 133-0187");

//        myAccount.setBalance(5000);
        System.out.println(myAccount.getCustomerName());

        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(5600);
        System.out.println(myAccount.getBalance());

        VipCustomer person1 = new VipCustomer("ben", 40);
        System.out.println(person1.getEmail());

        VipCustomer person2 = new VipCustomer();
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getEmail());
    }
}
