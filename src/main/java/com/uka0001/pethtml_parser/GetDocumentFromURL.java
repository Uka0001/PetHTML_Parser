package com.uka0001.pethtml_parser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GetDocumentFromURL {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://github.com").get();
        String title = doc.title();
        System.out.println("Title : " + title);
        Elements javaInfo = doc.getElementsMatchingText("java");
        System.out.println("Java Info : " + javaInfo);

//                Element pag = doc.getElementById("pagination_control");
//        Elements desktopOnly = doc.getElementsByClass("desktopOnly");
//
//        //Elements elements = doc.getElementsContainingOwnText("новини");
//        //System.out.println("Elements : " + elements);

//        String blogUrl = "https://spring.io/blog";
//        Document doc = Jsoup.connect(blogUrl).get();
//
//        Connection connection = Jsoup.connect(blogUrl);
//        connection.userAgent("Mozilla");
//        connection.timeout(5000);
//        connection.cookie("cookiename", "val234");
//        connection.cookie("cookiename", "val234");
//        connection.referrer("http://google.com");
//        connection.header("headersecurity", "xyz123");
//        Document docCustomConn = connection.get();

//        Document docCustomConn = Jsoup.connect(blogUrl)
//                .userAgent("Mozilla")
//                .timeout(5000)
//                .cookie("cookiename", "val234")
//                .cookie("anothercookie", "ilovejsoup")
//                .referrer("http://google.com")
//                .header("headersecurity", "xyz123")
//                .get();

//        Elements links = doc.select("a");
//        Elements sections = doc.select("section");
//        Elements logo = doc.select(".spring-logo--container");
//        Elements pagination = doc.select("#pagination_control");
//        Elements divsDescendant = doc.select("header div");
//        Elements divsDirect = doc.select("header > div");
//

//
//        Element firstArticle = doc.select("article").first();
//        Element timeElement = firstArticle.select("time").first();
//        String dateTimeOfFirstArticle = timeElement.attr("datetime");
//        Element sectionDiv = firstArticle.select("section div").first();
//        String sectionDivText = sectionDiv.text();
//        String articleHtml = firstArticle.html();
//        String outerHtml = firstArticle.outerHtml();
//
//        String docHtml = doc.html();
//        System.out.println(docHtml);
    }
}
