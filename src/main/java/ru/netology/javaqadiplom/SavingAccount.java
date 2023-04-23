package ru.netology.javaqadiplom;

public class SavingAccount extends Account {
    protected int minBalance;
    protected int maxBalance;

    public SavingAccount(int initialBalance, int minBalance, int maxBalance, int rate) {
        if (rate < 0) {
            throw new IllegalArgumentException(
                    "Накопительная ставка не может быть отрицательной, а у вас: " + rate
            );
        }
//        if (minBalance > maxBalance) {
//            throw new IllegalArgumentException(
//                    "Минимальный баланс не может быть больше максимального, а у вас: " + minBalance + " > " + maxBalance
//            );
//        }
//        if (initialBalance < minBalance) {
//            throw new IllegalArgumentException(
//                    "Начальный баланс не может быть меньше минимального, а у вас: " + initialBalance + " < " + minBalance
//            );
//        if (initialBalance > maxBalance) {
//            throw new IllegalArgumentException(
//                    "Начальный баланс не может быть больше масимального, а у вас: " + initialBalance + " > " + maxBalance
//            );
//        }
//        if (minBalance  < 0) {
//            throw new IllegalArgumentException(
//                    "Минимальный баланс не может быть отрицательным числом, а у вас: " + minBalance + " < " + 0
//            );
//        }

        this.balance = initialBalance;
        this.minBalance = minBalance;
        this.maxBalance = maxBalance;
        this.rate = rate;
    }

    @Override
    public boolean pay(int amount) {
        if (amount <= 0) {
            return false;
        }
//        if (amount <= balance) {
//            balance = balance - amount;
//        }
        balance = balance - amount;
        if (balance > minBalance) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance + amount < maxBalance) {
//            balance = amount + balance;
            balance = amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int yearChange() {
//        return balance = balance * rate / 100;
        return balance / 100 * rate;
    }

    public int getMinBalance() {
        return minBalance;
    }

    public int getMaxBalance() {
        return maxBalance;
    }
}
