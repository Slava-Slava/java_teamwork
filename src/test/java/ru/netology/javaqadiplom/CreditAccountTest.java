package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {

    @Test
    public void shouldAddToPositiveBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void shouldAddToPositiveBalanceMoreLimit() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(6_000);

        Assertions.assertEquals(5_000, account.getBalance());
    }

    @Test
    public void shouldAddToPositiveBalanceLimit() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(5_000);

        Assertions.assertEquals(5_000, account.getBalance());
    }

    @Test
    public void shouldAddToNegativBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(-5_000);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void shouldAddToInitialBalancePositiv() {
        CreditAccount account = new CreditAccount(
                2_000,
                5_000,
                15
        );

        account.add(1_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void shouldAddToInitialBalanceNegativ() {
        CreditAccount account = new CreditAccount(
                -2_000,
                5_000,
                15
        );

        account.add(1_000);

        Assertions.assertEquals(-1_000, account.getBalance());
    }

    @Test
    public void shouldAddToInitialBalanceOAndPay1_000() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.pay(1_000);

        Assertions.assertEquals(-1_000, account.getBalance());
    }

    @Test
    public void shouldAddToInitialBalance1_000AndPay1_000() {
        CreditAccount account = new CreditAccount(
                1_000,
                5_000,
                15
        );

        account.pay(1_000);

        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    public void shouldAddToInitialBalanceMinus1_000AndPay1_000() {
        CreditAccount account = new CreditAccount(
                -1_000,
                5_000,
                15
        );

        account.pay(1_000);

        Assertions.assertEquals(-2_000, account.getBalance());
    }


    @Test
    public void add1_000() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15

        );

        Assertions.assertTrue(account.add(1_000));
    }

    @Test
    public void add0() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15

        );

        Assertions.assertFalse(account.add(0));
    }

    @Test
    public void addMinus2_000() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15

        );

        Assertions.assertFalse(account.add(-2_000));
    }

    @Test
    public void pay1_000() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15

        );

        Assertions.assertTrue(account.pay(1_000));
    }

    @Test
    public void payMinus1_000() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15

        );

        Assertions.assertFalse(account.pay(-1_000));
    }

    @Test
    public void pay0() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15

        );

        Assertions.assertFalse(account.pay(0));
    }

    @Test
    public void yearChange200() {
        CreditAccount account = new CreditAccount(
                200,
                5_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(0, account.yearChange());
    }

    @Test
    public void yearChangeMinus200() {
        CreditAccount account = new CreditAccount(
                -200,
                5_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(-30, account.yearChange());
    }

    @Test
    public void yearChange0() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );
        account.yearChange();

        Assertions.assertEquals(0, account.yearChange());
    }

}
