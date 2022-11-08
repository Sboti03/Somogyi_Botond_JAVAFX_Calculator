package hu.petrik.calculator.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CalculatorController {


    private double resultFirst;
    private double resultSec;
    @FXML
    private Label resultField;
    @FXML
    private Spinner<Double> inputFirst;
    @FXML
    private Spinner<Double> inputSec;
    @FXML
    private Button plusBtn;
    @FXML
    private Button minusBtn;
    @FXML
    private Button multipleBtn;
    @FXML
    private Button divisionBtn;
    @FXML
    private Button remDivisionBtn;

    @FXML
    public void clickEvent(ActionEvent actionEvent) {
        try {
            resultFirst = inputFirst.getValue();
            resultSec = inputSec.getValue();
        }catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setContentText("Hibás adatot adott meg!");
            alert.show();
            return;
        }
        Button btn = (Button) actionEvent.getSource();
        switch (btn.getId()) {
            case "plusBtn":
                plus();
                break;
            case "minusBtn":
                minus();
                break;
            case "multipleBtn":
                multiple();
                break;
            case "divisionBtn":
                division();
                break;
            case "remDivisionBtn":
                remDivision();
                break;
        }

    }

    private void plus() {
        setResult(resultFirst + resultSec);
    }
    private void minus() {
        setResult(resultFirst - resultSec);

    }
    private void multiple() {
        setResult(resultFirst * resultSec);
    }
    private void division() {
        setResult(resultFirst / resultSec);

    }
    private void remDivision() {
        setResult(resultFirst % resultSec);
    }

    private void setResult(double result) {
        resultField.setText(String.valueOf(Math.floor(result * 100) / 100));
    }

}