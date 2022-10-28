package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private VBox itemHolder;

    public void initialize (URL location, ResourceBundle resourceBundle) {
        final Node[] nodes = new Node[4];

        for (int i = 0; i < nodes.length ; i++) {
            try {
                final int r = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                itemHolder.getChildren().add(nodes[i]);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}