module com.grupo3.javafxled {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.grupo3.javafxled to javafx.fxml;
    exports com.grupo3.javafxled;
}
