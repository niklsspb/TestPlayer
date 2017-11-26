import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParseSITE {
    public String url;


    ParseSITE()
    {

    }

    public Elements getUrl(String url) throws IOException {
            org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
            Elements element = doc.getElementsByClass("lips");
            //String s = String.valueOf(element.first().getAllElements().get(0));
            Elements elements = element.first().getElementsByTag("i");

            return elements;
    }


    public void getDictionary(String key, String value)
    {
        return ;
    }
}
