module com.gui.gui_exercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gui.gui_exercise to javafx.fxml;
    exports com.gui.gui_exercise;
}