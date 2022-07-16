package com.konovalova.lesson11;

public class VisaCard extends CreditCard{

    String clientName;
    String clientSurname;
    String cardNumber;
    String cardCVV;

    VisaCard(boolean isChip,int overdraftLimit,int terMonthLimit,String clientName,String clientSurname,String cardNumber,String cardCVV) {
        super(isChip,overdraftLimit,terMonthLimit);
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.cardNumber = cardNumber;
        this.cardCVV = cardCVV;
    }
}
