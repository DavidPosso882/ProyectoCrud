module com.example.trabajocrud {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.trabajocrud to javafx.fxml;
    exports com.example.trabajocrud;
}