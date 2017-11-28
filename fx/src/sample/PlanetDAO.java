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
        Planet s =null;
        Planet ss =null;
        for (int i = 0; i <10 ; i++) {
            s = new Planet("123","456");
            ss = new Planet("13223","456534534");
        }
        ObservableList<Planet> list = FXCollections.observableArrayList(mercury, venus, earth, s,ss);

        return list;
    }
}
