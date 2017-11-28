import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class Fx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
        //ComboBox comboBox = new ComboBox();
        ComboBox<Anime> comboBox = new ComboBox<Anime>();
        ObservableList<Anime> list = AnimeDAO.getAnimeList();
        comboBox.setItems(list);

        comboBox.getSelectionModel().selectFirst();
        String s = String.valueOf(list.get(0).numberSeries);
        System.out.println(s);
        /*primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(5));
        root.setHgap(5);

        root.getChildren().add(new Label("Select Planet:"));
        root.getChildren().add(comboBox);

        primaryStage.setTitle("ComboxBox (o7planning.org)");
        Scene scene = new Scene(root, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
