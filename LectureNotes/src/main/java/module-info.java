module com.week_0.week_0 {
    requires javafx.controls;
    requires javafx.fxml;
    requires input.utils;


    opens com.week_0.week_0 to javafx.fxml;
    exports com.week_0.week_0;
}