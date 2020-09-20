package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // default field values if provided no value to the constructor
        // call another constructor from another constructor
        // Best Practice ให้สร้าง major constructor ที่เซ็ตทุก field แล้วตัวอื่นๆ เรียก this()
        this(7984361, 12000,"John", "John@gmail.com", "(087) 121-0227");
        System.out.println("Empty constructor called");
    }

    // major constructor
    // overloading constructor
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("account constructor with parameters was called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("total balance is " + balance);
    }

    public void withdraw(double amount) {
        if((balance - amount) < 0) {
            System.out.println("you don't have enough money");
        } else {
            this.balance -= amount;
            System.out.println("total balance is " + balance);
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
