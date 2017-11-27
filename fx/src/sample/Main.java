package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.cell.ComboBoxListCellBuilder;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
        ComboBox<Planet> comboBox = new ComboBox<Planet>();

        ObservableList<Planet> list = PlanetDAO.getPlanetList();
        //String s = list.get(0).code;
        comboBox.setItems(list);
        comboBox.getSelectionModel().select(1);

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


    public static void main(String[] args) {
        launch(args);
    }
}
