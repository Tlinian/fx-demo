package com.sics.javafxutildemo.controller;

import com.sics.javafxutildemo.common.DbTypeEnum;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class HelloViewController {
    @FXML
    private void initialize() {
        ObservableList<DbTypeEnum> observableList = FXCollections.observableArrayList(DbTypeEnum.values());
        sourceType.setItems(observableList);
        sinkType.setItems(observableList);
        sourceType.setValue(DbTypeEnum.YASHANDB);
        sinkType.setValue(DbTypeEnum.YASHANDB);
    }

    @FXML
    private Button convertBut;

    @FXML
    private ComboBox<DbTypeEnum> sinkType;

    @FXML
    private TextArea sinkSql;

    @FXML
    private TextArea sourceSql;

    @FXML
    private ComboBox<DbTypeEnum> sourceType;

    @FXML
    void convertAct(ActionEvent event) {
        System.out.println("sourceType:"+sourceType.getValue()+" sinkType: "+sinkType.getValue());
        sinkSql.setText("sahsjahsajh");
    }
}
