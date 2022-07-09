package com.konovalova.lesson8;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTask14 {
    public static void main(String[] args) {
        /* Задание 23
        Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
        которых есть параметры, например <p id=”p1”>, и замену их на простые теги
        абзацев <p>.
        **/
        String ourString = "<p>Accumsan metus tristique feugiat magna facilisi." +
                "Ac ornare quisque, quam urna? Rutrum aenean taciti pharetra dictum arcu arcu aliquet " +
                "aliquet posuere. Euismod mus pulvinar sociosqu maecenas nunc nunc.<p> <p>Malesuada erat enim " +
                 "sed tellus. Senectus rhoncus fringilla volutpat iaculis elementum urna molestie fames. " +
                "Cursus auctor tempus tempus morbi facilisi commodo condimentum lorem aliquet. Quisque conubia, " +
                " lacus habitasse egestas. Lobortis ipsum sapien phasellus sagittis suspendisse. Blandit commodo " +
                " amet cubilia augue iaculis sit vestibulum imperdiet ligula posuere varius. Arcu hac risus penatibus.<p id=”p1”>";

        ourString = ourString.replaceAll("<p id=.{4,5}>", "<p>");

        Pattern regexp =Pattern.compile("<p>");
        Matcher matcherString = regexp.matcher(ourString);
        System.out.println("Found tags <p> are at index range: ");
        while(matcherString.find()) {
                System.out.println(matcherString.start() + " " + (matcherString.end()-1));

        }
    }
}
