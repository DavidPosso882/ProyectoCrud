package com.example.trabajocrud;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Person> personData = FXCollections.observableArrayList();
    public MainApp() {
        // Intenta cargar los datos desde el archivo
        loadDataFromFile("personData.txt");

        // Si la lista de personas está vacía (lo que sucederá si el archivo no existe), agrega algunos datos quemados
        if (personData.isEmpty()) {
            personData = FXCollections.observableArrayList();
            personData.add(new Person("David", "Posso"));
            personData.add(new Person("Ruth", "Mueller"));
            // Agrega más personas aquí...
        }
    }

    @Override
    public void start(Stage primaryStage) {
        // Intenta cargar los datos desde el archivo antes de inicializar la interfaz de usuario
        loadDataFromFile("personData.txt");

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ALMACÉN");
        initRootLayout();
        showPersonOverview();
    }
    public ObservableList<Person> getPersonData() {
        return personData;
    }


    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
            // Give the controller access to the main app.
            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public static void main(String[] args) {
        launch(args);
    }
    public boolean showPersonEditDialog(Person person) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("PersonEditDialog.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Person");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            // Set the person into the controller.
            PersonEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(person);
            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();
            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public void saveDataToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (Person person : personData) {
                writer.println(person.toLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadDataFromFile(String fileName) {
        personData = FXCollections.observableArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                personData.add(Person.fromLine(line));
            }
        } catch (IOException e) {
            // Si el archivo no existe, crea una nueva lista vacía
            personData = FXCollections.observableArrayList();
        }
    }

    public void stop() {
        // Guarda los datos en el archivo al cerrar la aplicación
        saveDataToFile("personData.txt");
    }

}



