package com.konovalova.lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTask13 {
    public static void main(String[] args) {
        /* Задание 22
        Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
        записаных по правилам Java, с помощью регулярных выражений и вывести их на
        страницу
        **/
        System.out.println("Print Your text with hexadecimal numbers: ");
        Scanner in = new Scanner(System.in);
        String ourString = in.nextLine();

        Pattern regexp =Pattern.compile("[A-Fa-f0-9]+");
        Matcher matcherString = regexp.matcher(ourString);
        while(matcherString.find()){
            System.out.println(matcherString.group());

        }
    }
}
