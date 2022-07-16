package com.konovalova.lesson11;

public class CreditCard extends BankCards{

    int overdraftLimit;
    int terMonthLimit;

    CreditCard(boolean isChip,int overdraftLimit,int terMonthLimit) {
        super(isChip);
        this.overdraftLimit = overdraftLimit;
        this.terMonthLimit = terMonthLimit;
    }
}
