package com.konovalova.lesson11;

public class VisaCard extends CreditCard{

    private String clientName;
    private String clientSurname;
    private String cardNumber;
    private String cardCVV;

    public VisaCard(boolean isChip,int overdraftLimit,int terMonthLimit,String clientName,String clientSurname,String cardNumber,String cardCVV) {
        super(isChip,overdraftLimit,terMonthLimit);
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.cardNumber = cardNumber;
        this.cardCVV = cardCVV;
    }

    @Override
    public String toString() {
        return "VisaCard{" +
                "clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardCVV='" + cardCVV + '\'' +
                '}';
    }
}
