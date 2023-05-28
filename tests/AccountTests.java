package tests;


import bank.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTests {
    @Test
    public void testValidDeposit() {
        Account account = new Account(100.0, "13579");
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.0, -50.0})
    public void testInvalidDeposit(double amount) {
        Account account = new Account(100.0, "13579");
        account.deposit(amount);
        assertEquals(100.0, account.getBalance());
    }


    @Test
    public void testWithdrawValidAmount() {
        Account account = new Account(100.0, "13579");
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance());
    }



    @ParameterizedTest
    @ValueSource(doubles = {150.0, 0.0, -50.0})
    public void testWithdrawInvalid(double amount) {
        Account account = new Account(100.0, "13579");
        account.withdraw(amount);
        assertEquals(100.0, account.getBalance());
    }



    @Test
    public void testGetBalance() {
        Account account = new Account(100.0, "13579");
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testGetAccountNr() {
        Account account = new Account(100.0, "13579");
        assertEquals("13579", account.getAccountNr());
    }
}
