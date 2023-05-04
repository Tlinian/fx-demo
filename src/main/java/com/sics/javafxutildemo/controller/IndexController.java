package com.sics.javafxutildemo.controller;

import com.sics.javafxutildemo.common.DbTypeEnum;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class IndexController {

    @FXML
    private void initialize() {
        ObservableList<DbTypeEnum> observableList = FXCollections.observableArrayList(DbTypeEnum.values());
        sourceType.setItems(observableList);
        sinkType.setItems(observableList);
    }

    @FXML
    private Button convertBut;

    @FXML
    private ComboBox<DbTypeEnum> sinkType ;

    @FXML
    private AnchorPane sourceSql;

    @FXML
    private AnchorPane sinkSql;

    @FXML
    private ComboBox<DbTypeEnum> sourceType;

    @FXML
    void convertAct(ActionEvent event) {
        System.out.println("sourceType:"+sourceType+" sinkType: "+sinkType);
    }
}

