package com.uka0001.pethtml_parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GetAllFromURL_ERAU {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://erau.unba.org.ua").get();

        Elements ERAUInfo = doc.getAllElements();
        System.out.println("Java Info : " + ERAUInfo);
    }
}
