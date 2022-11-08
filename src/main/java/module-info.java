module hu.petrik.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens hu.petrik.calculator.calculator to javafx.fxml;
    exports hu.petrik.calculator.calculator;
}