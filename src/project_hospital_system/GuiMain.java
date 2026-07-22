/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package project_hospital_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuiMain extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {

            Parent root =
                    FXMLLoader.load(getClass().getResource("welcome.fxml"));

            Scene scene = new Scene(root, 1200, 700);

            scene.getStylesheets().add(
                    getClass().getResource("style.css").toExternalForm()
            );

            primaryStage.setTitle("Alexandria Hospital");

            primaryStage.setScene(scene);

            primaryStage.show();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}