import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.jsoup.select.Elements;

import java.io.IOException;

public class AnimeDAO {
    public static ObservableList<Anime> getAnimeList() throws IOException {
        ParseSITE ps = new ParseSITE();
        String url = "http://fan-naruto.ru/load/anime_onlajn/ongoingi/van_pis_smotret_russkie_subtitry_vse_serii/51-1-0-2489";
        Elements elements = ps.getUrl(url);
        Anime[] array = new Anime[elements.size()];
        String key = null;
        String value = null;
        String player = null;
        ObservableList<Anime> list = FXCollections.observableArrayList();
        for (int i = 0; i < elements.size(); i++) {

            key = elements.get(i).text();
            value = elements.get(i).attr("data-id");
            player = elements.get(i).attr("data-p");
            array[i] = new Anime(key, value);
            //uf.put(key,player);
            //list.add(array[i]);
            list = FXCollections.observableArrayList(array[i]);
        }
        //ObservableList<Anime> list = FXCollections.observableArrayList();
        for (int i = 0; i <array.length ; i++) {

        }
        list.addAll(array);
        //

        return list;
    }
}
