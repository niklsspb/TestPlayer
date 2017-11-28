package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.cell.ComboBoxListCellBuilder;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String MEDIA_URL =
            "http://video.sibnet.ru/v/74773300f20e3ad6228fe527826fa9a6/2663675.mp4";
    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
        /*ComboBox<Planet> comboBox = new ComboBox<Planet>();

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
        primaryStage.show();*/

        /*WebView webview = new WebView();
        webview.getEngine().load(
                "video.sibnet.ru/shell.php?videoid=2663678"
        );
        webview.setPrefSize(640, 390);

        primaryStage.setScene(new Scene(webview));
        primaryStage.show();*/
        primaryStage.setTitle("Embedded Media Player");
        Group root = new Group();
        Scene scene = new Scene(root, 640, 480);
        Media media = new Media(MEDIA_URL);


        MediaPlayer mediaPlayer = new MediaPlayer(media);

        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        System.out.println(mediaView.getFitWidth());
        System.out.println(mediaView.getFitHeight());


        ((Group)scene.getRoot()).getChildren().add(mediaView);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
