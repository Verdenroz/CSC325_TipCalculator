module org.farmingdale.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.farmingdale.tipcalculator to javafx.fxml;
    exports org.farmingdale.tipcalculator;
}