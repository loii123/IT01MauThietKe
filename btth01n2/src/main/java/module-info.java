module com.pbl.btth01n2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pbl.btth01n2 to javafx.fxml;
    exports com.pbl.btth01n2;
}
