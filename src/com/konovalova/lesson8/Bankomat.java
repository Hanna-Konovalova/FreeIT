package com.konovalova.lesson8;

public class Bankomat {

    private int nom20;
    private int nom50;
    private int nom100;
    private int count20;
    private int count50;
    private int count100;


    public Bankomat(int nom20,int nom50,int nom100){
        this.nom20 = nom20;
        this.nom50 = nom50;
        this.nom100 = nom100;
    };
    public void putMoney(int qnom20, int qnom50, int qnom100){
        this.nom20 += qnom20;
        this.nom50 += qnom50;
        this.nom100 += qnom100;
    }
    public boolean withdrawMoney(int withAmount){
        if(isMoneyEnough(withAmount)){
          if(withAmount%20!=0){
             if(nom50>0){
                 withAmount-= 50;
                 count50++;
             }else{
                 System.out.println("No banknotes to write off the required amount");
                 return false;
             }
              return toMakeWithdrou(withAmount);
          }else {
              return toMakeWithdrou(withAmount);
          }
       } else {
            System.out.println("Not enough money");
            return false;
        }
    }
    private boolean toMakeWithdrou(int Amount){

        while(Amount%100!=0){
            if(nom20>count20){
                Amount-=20;
                count20++;
            }else{
                System.out.println("No banknotes to write off the required amount");
                return false;
            }
        }
        while(Amount!=0){
            if(nom100>count100){
                Amount-=100;
                count100++;
            } else if (nom50>count50) {
                Amount-=50;
                count50++;
            } else if (nom20>count20){
                Amount-=20;
                count20++;
            }
        }
        this.nom100-=count100;
        this.nom50-=count50;
        this.nom20-=count20;
        System.out.println("Money debited: bill 20 - " + count20 +  ", bill 50 - " + count50 +  ", bill 100 - " + count100);
        return true;
    };
    private boolean isMoneyEnough(int withAmount){
        return (getRestOfMoney() - withAmount)>0;
    }
    private int getRestOfMoney(){
        return this.nom20*20 + this.nom50*50 + this.nom100*100;
    }

}

