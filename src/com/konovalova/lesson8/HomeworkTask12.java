package com.konovalova.lesson8;

public class HomeworkTask12 {
    public static void main(String[] args) {
         /* Задание 21
        Напишите три цикла выполняющих многократное сложение строк, один с
        помощью оператора сложения и String, другой с помощью StringBuilder и метода
        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
         **/
        String simpleString = "";
        StringBuilder bldString = new StringBuilder(1000);
        StringBuffer bufString = new StringBuffer(1000);
        String partString = "abcde";

        //1
        long time = System.currentTimeMillis();
        while(simpleString.length()<1001){
            simpleString = simpleString + partString;
        }
        System.out.println("Time for simple string concatenation: " + (System.currentTimeMillis() - time));
        //2
        long timeBld = System.currentTimeMillis();
        while(bldString.length()<1001){
            bldString = bldString.append(partString);
        }
        System.out.println("Time for StringBuilder: " + (System.currentTimeMillis() - timeBld));
        //3
        long timeBuf = System.currentTimeMillis();
        while(bufString.length()<1001){
            bufString = bufString.append(partString);
        }
        System.out.println("Time for StringBuffer: " + (System.currentTimeMillis() - timeBuf));
    }
}
