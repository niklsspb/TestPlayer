package sample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Site {
    public String url;


    Site()
    {

    }

    public Elements getUrl(String url) throws IOException {
        org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
        Elements element = doc.getElementsByClass("lips");
        //String s = String.valueOf(element.first().getAllElements().get(0));
        Elements elements = element.first().getElementsByTag("i");

        return elements;
    }

    public Elements getSite(String url) throws IOException {
        Document document = Jsoup.connect(url).userAgent("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Mobile Safari/537.36").get();
        //document
        Elements element = document.getElementsByTag("script");
        Elements elements = element;
        return elements;
    }
}
