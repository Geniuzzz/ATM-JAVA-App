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
public class Processor {
   int restart;
   Scanner input = new Scanner(System.in);
   Account myAccount = new Account();
   
public void restart() {
    System.out.println("Do want to continue with another transaction ?\n  1. YES  \n Any other selection will EXIT");
        restart = input.nextInt();
    if (restart == 1) {
        this.start(); 
    }
    else
        System.exit(0);

}
public void start() {
    myAccount.displayMessage();
            System.out.println( "Please enter your PASSWORD:\n");
            int password = input.nextInt();
    
    if (password != myAccount.getAccountPassword()) {
            System.out.println("incorrect Password");   
    }
    else if (password == myAccount.getAccountPassword()) {
            this.functions();
    }
}
   
public void functions() {
    System.out.println("Please select an option:\n 1. Deposit\n 2. Withdraw\n 3. Transfer\n 4. Check Balance\n 5. Change Password \n\n");
        int option = input.nextInt();
    switch(option){
        case 1:
            System.out.println("Enter amount you wish to deposit: ");
            double depositAmount = input.nextDouble();
            myAccount.deposit (depositAmount);
        
              
            System.out.println("You have deposited N" +depositAmount  );
            System.out.println("Your new balance is N" + myAccount.getBalance());
        break;
        
        
        case 2:
            System.out.println("Enter amount you wish to withdraw: ");
            double withdrawAmount = input.nextDouble();
              
            if (withdrawAmount   > myAccount.getBalance()) {
                System.out.println("Insufficient funds");
            }
            else 
                myAccount.withdraw(withdrawAmount);
               System.out.println("You have withdrawn N" + withdrawAmount);
                
        break;
            
        case 3:
            System.out.println("Enter amount you wish to Transfer: ");
            double transferAmount = input.nextDouble();
            if (transferAmount   > myAccount.getBalance()) {
                System.out.println("Insufficient funds");
            }
            else if (transferAmount   <= myAccount.getBalance()) {
                myAccount.transfer(transferAmount);
               System.out.println("You have transferred N" + transferAmount);
               System.out.println("Your new balance is N" + (myAccount.getBalance() + transferAmount));
            }
        break;
            
        case 4:
             System.out.println("Your account balance is: N" + myAccount.getBalance());
                
        break;
        case 5:
             System.out.println( "Please enter your PASSWORD:\n");
            int passwordChange = input.nextInt();
            if (passwordChange != myAccount.getAccountPassword()) {
                System.out.println("incorrect Password");
            }
            if (passwordChange == myAccount.getAccountPassword()) {
                System.out.println("correct Password. Enter new password");
                         int newPassword = input.nextInt();
                    System.out.println("Re-Enter new password");
                          int confirmNewPassword = input.nextInt();
            if (newPassword == confirmNewPassword){
                            myAccount.changePassword(newPassword);
                     System.out.println("New password successfully changed");
        break;         
            }
            }
    } 
        this.restart();
    }
    
}
