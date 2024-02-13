package com.example.demo;

import Service.DataGet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class Controller {

    @FXML
    private Button Button;

    @FXML
    private TextField textField;
    @FXML
    public ListView<String> listView;

    private DataGet dataGet;
    @FXML
    void initialize() {
        dataGet = new DataGet();
    }
    @FXML
    void ButtonClick(ActionEvent event) {    // обработчик нажатия кнопки
        try {
            String text = textField.getText();   // Присваеваем введеную строку пользователем.
            dataGet.getData(text);
            listView.getItems().add(text + "  [загрузка прошла успешно!]"); // если строка прошла все проверки выводим в консоль
            }
        catch (RuntimeException e){
            System.out.printf(e.getMessage());
            listView.getItems().add(e.getMessage());
        }
        textField.clear();
    }

}
