package com.konovalova.lesson11;

public class DebtCard extends BankCards{

    int amountLimit;

    DebtCard(boolean isChip,int amountLimit) {
        super(isChip);
        this.amountLimit = amountLimit;
    }
}
