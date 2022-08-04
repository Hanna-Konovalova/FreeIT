package com.konovalova.lesson11;

import java.util.Date;

public class BankCardsRunner {

    public static void main(String[] args) {
       /*Задача 27. Создать иерархию классов, описывающих банковские карточки.
       Иерархия должна иметь хотя бы три уровня.*/

       VisaCard goldCard = new VisaCard(true,6000,12,"Sasha","Ivanov","1234567898765432","123");
       MasterCard freeCard = new MasterCard(false,10000);

    }
}
