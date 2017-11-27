package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
    private static final HashMap<String, String> uf = new HashMap();
    public static HashMap <String, String> fillMap()
    {

        //ObservableMap<String, String> list = FXCollections.observableMap();
        return uf;
    }
}
