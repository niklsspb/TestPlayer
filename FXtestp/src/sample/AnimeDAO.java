package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class AnimeDAO {
    public static ObservableList<Anime> getAnimeList() throws IOException {
        Site site = new Site();
        String url = "http://fan-naruto.ru/load/anime_onlajn/ongoingi/van_pis_smotret_russkie_subtitry_vse_serii/51-1-0-2489";
        Elements elements = site.getUrl(url);
        String key = null;
        String value = null;
        String player = null;
        ArrayList<Anime> animeArrayList = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {

            key = elements.get(i).text().substring(0,3);
            value = elements.get(i).attr("data-id");
            player = elements.get(i).attr("data-p");
            Anime array = new Anime(key, player ,value);
            animeArrayList.add(array);
        }
        ObservableList<Anime> list = FXCollections.observableArrayList(animeArrayList);
        return list;
    }
}
