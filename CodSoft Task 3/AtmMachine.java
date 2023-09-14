package Java_Internship;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance- amount;
            System.out.println("Withdrawn Rs" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class ATM {
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void checkBalance() {
        double balance = bankAccount.getBalance();
        System.out.println("Your balance is Rs" + balance);
    }

    public void deposit() {
        System.out.print("Enter the deposit amount: Rs");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    public void withdraw() {
        System.out.print("Enter the withdrawal amount: Rs");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }

    public void exit() {
        System.out.println("Thank you ");
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(5000.0);
        ATM atm = new ATM(bankAccount);
        atm.run();
    }
}




