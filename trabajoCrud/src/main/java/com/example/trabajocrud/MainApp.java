package com.example.trabajocrud;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    private ObservableList<Persona> personData = FXCollections.observableArrayList();
    /**
     * Constructor
     */
    public MainApp() {
        // Add some sample data
        personData.add(new Persona("Hans", "Muster"));
        personData.add(new Persona("Ruth", "Mueller"));
        personData.add(new Persona("Heinz", "Kurz"));
        personData.add(new Persona("Cornelia", "Meier"));
        personData.add(new Persona("Werner", "Meyer"));
        personData.add(new Persona("Lydia", "Kunz"));
        personData.add(new Persona("Anna", "Best"));
        personData.add(new Persona("Stefan", "Meier"));
        personData.add(new Persona("Martin", "Mueller"));
    }
    /**
     * Returns the data as an observable list of Persons.
     * @return
     */
    public ObservableList<Persona> getPersonData() {
        return personData;
    }
    private Stage primaryStage;
    private AnchorPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        initRootLayout();
        showPersonOverview();
    }

    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("PersonOverview.fxml"));
            rootLayout = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Add person overview to root layout.
            rootLayout.getChildren().add(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public static void main(String[] args) {
        launch(args);
    }
}


