package com.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Parent parent = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
        Stage stage1 = new Stage(StageStyle.DECORATED);
        stage1.setTitle("Test");
        stage1.setScene(new Scene(parent));
        stage1.show();

    }

    public static void main(String[] args){
        launch(args);
    }

}
