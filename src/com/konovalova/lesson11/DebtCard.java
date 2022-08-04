package com.konovalova.lesson11;

public class DebtCard extends BankCards{

    private int amountLimit;

    public DebtCard(boolean isChip,int amountLimit) {
        super(isChip);
        this.amountLimit = amountLimit;
    }

    public int getAmountLimit() {
        return amountLimit;
    }

    public boolean getIsChip(){return super.getIsChip();}
}
