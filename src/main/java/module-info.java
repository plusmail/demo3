module kroryi.demo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens kroryi.demo3 to javafx.fxml;
    exports kroryi.demo3;
}