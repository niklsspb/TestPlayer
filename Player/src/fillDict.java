import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;

public class fillDict {
    private static final HashMap<String, String> uf = new HashMap();

    public static HashMap <String, String> fillMap() throws IOException {
        ParseSITE ps = new ParseSITE();
        String url = "http://fan-naruto.ru/load/anime_onlajn/ongoingi/van_pis_smotret_russkie_subtitry_vse_serii/51-1-0-2489";
        Elements elements = ps.getUrl(url);

        String key = null;
        String value = null;
        String player = null;
        for (int i = 0; i <elements.size() ; i++) {

            key = elements.get(i).text();
            value = elements.get(i).attr("data-id");
            player= elements.get(i).attr("data-p");
            uf.put(key,value);
            //uf.put(key,player);

        }
        return uf;
    }
}
