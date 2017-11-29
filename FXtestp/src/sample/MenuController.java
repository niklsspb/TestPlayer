package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MenuController {

    @FXML private sample.Controller controller;

    public void handleKeyInput(final InputEvent event) {
        if (event instanceof KeyEvent) {
            final KeyEvent keyEvent = (KeyEvent) event;
            if (keyEvent.isControlDown() && keyEvent.getCode() == KeyCode.A) {
                provideAboutFunctionality();
            }
        }
    }

    private void provideAboutFunctionality() {
        System.out.println("You clicked on About!");
    }

    public void handleAboutAction(final ActionEvent actionEvent) {
        provideAboutFunctionality();
    }

    @FXML
    private void initialize() {
        controller.init(this);
    }
}
