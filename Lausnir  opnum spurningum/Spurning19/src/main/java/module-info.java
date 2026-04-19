module hi.vidmot {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;

    opens hi.vidmot to javafx.fxml;
    exports hi.vidmot;
}