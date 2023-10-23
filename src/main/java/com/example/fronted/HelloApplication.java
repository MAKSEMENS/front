package com.example.fronted;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * @author Max
 * @version 1.0
 * @see Controller
 * This is Main class for using java fx.
 * Here I launch fxml file.
 */
public class HelloApplication extends Application {
    @Override
    /**
     * Method for opening fxml file and creating scene
     * @param stage is class instance (used to create a scene window)
     */
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        stage.setTitle("КИНОТЕАТР");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args command lines value
     *Launch stage
     */
    public static void main(String[] args) {
        launch();
    }
}