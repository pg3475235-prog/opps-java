/*Scenario: An online banking application allows customers to withdraw money from their account. 
The system should prevent withdrawal when the requested amount is greater than the available balance.
 (a) Create a class BankAccount with accountNumber and balance attributes. [2] 
 (b) Create a method withdraw(double amount) that throws an exception if the withdrawal amount is greater than the balance. [3] 
 (c) Create a custom exception InsufficientBalanceException. [2] 
 (d) Handle the exception in the main() method and display an appropriate message to the customer. [3] 
 */

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance! Withdrawal cannot be completed.");
        }
        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class BankTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(12345, 5000);

        try {
            account.withdraw(7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
