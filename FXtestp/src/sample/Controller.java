package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class Controller  {

    private MenuController menu;
    @FXML public ComboBox<Anime> comboBox = new ComboBox<Anime>();



    public void setComboBoxData() throws IOException {
        ObservableList<Anime> animeObservableList = AnimeDAO.getAnimeList();
        comboBox.setItems(animeObservableList);
        comboBox.getSelectionModel().selectFirst();
    }

    public void init(MenuController menuController) {
        menu = menuController;
    }
}
