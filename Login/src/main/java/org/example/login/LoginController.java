package org.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class LoginController {
    @FXML
    Button LoginButton;

    private Stage stage;
    private Parent root;


    @FXML
    public void Login(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    public void LoginEntered(ActionEvent e) throws Exception {
        LoginButton.setBackground(Background.fill(Color.rgb(255,255,255)));
        LoginButton.setTextFill(Color. rgb(0, 153, 255));

    }
    @FXML
    public void LoginExited(ActionEvent e) throws Exception {
        LoginButton.setBackground(Background.fill(Color. rgb(0, 153, 255)));
        LoginButton.setTextFill(Color.WHITE);
    }

}