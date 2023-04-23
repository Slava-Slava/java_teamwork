package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void purchaseAmountLessThanInitialBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(500);

        Assertions.assertEquals(1_500, account.getBalance());
    }
    @Test
    public void purchaseAmountEqualThanInitialBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(2_000);

        Assertions.assertEquals(0, account.getBalance());
    }
    @Test
    public void purchaseAmountMoreThanInitialBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(3_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }
    @Test
    public void purchaseNegativeAmount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(-3_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }
    @Test
    public void purchaseZeroAmount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.pay(0);

        Assertions.assertEquals(2_000, account.getBalance());
    }
    @Test
    public void shouldAddAmountLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(3_000);

        Assertions.assertEquals(2_000 + 3_000, account.getBalance());
    }
    @Test
    public void shouldAddAmountMoreThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(11_000);

        Assertions.assertEquals(2_000, account.getBalance());
    }
    @Test
    public void shouldAddAmountLessThanMinBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(500);

        Assertions.assertEquals(2_000 + 500, account.getBalance());
    }
    @Test
    public void shouldAddNegativeAmount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(-500);

        Assertions.assertEquals(2_000, account.getBalance());
    }
    @Test
    public void shouldAddZeroReplenishmentAmount() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(0);

        Assertions.assertEquals(2_000, account.getBalance());
    }
    @Test
    public void interestCalculationForPositiveBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.yearChange();

        Assertions.assertEquals(100, account.getBalance());
    }
    @Test
    public void interestCalculationZorZeroBalance() {
        SavingAccount account = new SavingAccount(
                0,
                0,
                10_000,
                5
        );

        account.yearChange();

        Assertions.assertEquals(0, account.getBalance());
    }
}
