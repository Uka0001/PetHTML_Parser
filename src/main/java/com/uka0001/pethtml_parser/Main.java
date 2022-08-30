package com.uka0001.pethtml_parser;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Document doc = Jsoup.connect("https://unba.org.ua/activity/").get();
        String title = doc.title();
        System.out.println("Title : " + title);
    }
}
