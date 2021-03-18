package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextField txtCalc1;
    @FXML
    TextField txtCalc2;

    public void calc(ActionEvent actionEvent) {
        int temp = Integer.parseInt(txtCalc1.getText());
        txtCalc2.setText(1000*temp+"");

    }
}
