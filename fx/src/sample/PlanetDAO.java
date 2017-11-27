package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.util.HashMap;

public class PlanetDAO {
    public static ObservableList<Planet> getPlanetList() {

        Planet mercury = new Planet("MER", "Mercury");
        Planet venus = new Planet("VEN", "Venus");
        Planet earth = new Planet("EAR", "Earth");
        for (int i = 0; i <10 ; i++) {
            Planet s = new Planet("","");
        }
        ObservableList<Planet> list = FXCollections.observableArrayList(mercury, venus, earth);

        return list;
    }
}
