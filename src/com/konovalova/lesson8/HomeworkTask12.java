package com.konovalova.lesson8;

public class HomeworkTask12 {
    public static void main(String[] args) {
         /* Задание 21
        Напишите три цикла выполняющих многократное сложение строк, один с
        помощью оператора сложения и String, другой с помощью StringBuilder и метода
        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
         **/
        String simpleString = "";
        StringBuilder bldString = new StringBuilder();
        StringBuffer bufString = new StringBuffer();
        String partString = "abcde";

        //1
        long time = System.currentTimeMillis();
       for(int i=0;i<100000;i++){
            simpleString = simpleString + partString;
        }
        System.out.println("Time for simple string concatenation: " + (System.currentTimeMillis() - time));
        //2
        long timeBld = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            bldString = bldString.append(partString);
        }
        System.out.println("Time for StringBuilder: " + (System.currentTimeMillis() - timeBld));
        //3
        long timeBuf = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            bufString = bufString.append(partString);
        }
        System.out.println("Time for StringBuffer: " + (System.currentTimeMillis() - timeBuf));

    }
}
