module com.sics.javafxutildemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.sics.javafxutildemo to javafx.fxml;
    exports com.sics.javafxutildemo;

    opens com.sics.javafxutildemo.controller to javafx.fxml;
    exports com.sics.javafxutildemo.controller;
}