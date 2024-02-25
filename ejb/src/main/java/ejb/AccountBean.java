package ejb;

import core.Account;
import jakarta.ejb.Stateless;

@Stateless
public class AccountBean implements Account {
    private double accountBalance;
    @Override
    public void deposit(double amount) {
     if(amount > 0) {
         accountBalance += amount;
         System.out.println("Deposited " + amount + " into account. New balance is " + accountBalance);
     }

    }

    public double getBalance() {
        return accountBalance;
    }
}
