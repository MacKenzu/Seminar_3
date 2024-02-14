package View;

import Service.DataGet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;


public class Controller {

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
    void ButtonClick(ActionEvent event) {
        try {
            dataGet.getData(textField.getText());
            listView.getItems().add(textField.getText() + "  [загрузка прошла успешно!]");
            textField.clear();
            }
        catch (RuntimeException | IOException e){
            System.out.printf(e.getMessage());
            listView.getItems().add(e.getMessage());
            e.printStackTrace();
        }

    }


}
