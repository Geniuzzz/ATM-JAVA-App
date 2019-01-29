/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Samaac
 */
import java.util.Scanner;
public class Account {
    String accountName = "OSCAR VICTORY JAVA";
    private int accountPassword = 0000;
    private double accountBalance = 0.0;
    
 
    Scanner input = new Scanner(System.in);
    public void displayMessage() {
         
    System.out.printf( "Welcome to Java Virtual Cashless Bank\n%s\n", accountName );
    }
 public void setPassword(int password) {
     
        accountPassword = password;
    }

    public void setAccountBalance(double balance) {
        accountBalance = balance;
    }
     public int getAccountPassword() {
        return accountPassword;
    }

    public double getBalance() {
        return accountBalance;
    }
    public void deposit(double depositAmount) {
      accountBalance= accountBalance + depositAmount;  
    
    }
    public void withdraw(double withdrawAmount) {
      accountBalance= accountBalance - withdrawAmount;  
      
    }
    public void transfer (double transferAmount) {
      accountBalance = accountBalance- transferAmount;
    }

    public void changePassword(int newPassword){
        accountPassword = newPassword;
    }
}
 
