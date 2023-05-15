module com.example.partie2 {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.partie2 to javafx.fxml;
    exports com.example.partie2;
}