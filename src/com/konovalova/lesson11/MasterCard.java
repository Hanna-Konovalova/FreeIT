package com.konovalova.lesson11;

import java.util.Date;

public class MasterCard extends DebtCard{

    public MasterCard(boolean isChip, int amountLimit) {
        super(isChip,amountLimit);
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "isChip='" + super.getIsChip() + '\'' +
                ", amountLimit='" + super.getAmountLimit() +
                '}';
    }
}
