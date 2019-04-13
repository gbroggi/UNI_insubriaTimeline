package com.example.giova.uni_insubriatimelineapp;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlReader extends Thread {
    private String url;

    public HtmlReader(String url)
    {
        this.url= url;
    }

    private Connection ConnectToPage(){
        return Jsoup.connect(url);
    }
    private Map<String,List<String>> EstractFileHtml() throws IOException {
        File timelineWebPage= new File(url);
        Document doc= Jsoup.parse(timelineWebPage,"UTF-8");
        Elements allTrTags= doc.select("tr");
        Element tableHeader= allTrTags.first();
        List<Element> timelineTableDataList= allTrTags.subList(1,allTrTags.size());

        for(Element e : timelineTableDataList)
        {
            Elements TbTagList=e.select("tb");
            Element RowObject= TbTagList.first();
            List<Element> RowElements= TbTagList.subList(1,TbTagList.size());

        }

        Map<String, List<String>> tableMap= new HashMap<>();

        return new HashMap<>();
    }
    private void getTimelineObject( Element lessons)
    {

    }
    public void run ()
    {

    }
}
