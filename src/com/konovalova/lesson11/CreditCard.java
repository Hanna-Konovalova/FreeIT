package com.konovalova.lesson11;

public class CreditCard extends BankCards{

    private int overdraftLimit;
    private int terMonthLimit;

    public CreditCard(boolean isChip,int overdraftLimit,int terMonthLimit) {
        super(isChip);
        this.overdraftLimit = overdraftLimit;
        this.terMonthLimit = terMonthLimit;
    }
}
