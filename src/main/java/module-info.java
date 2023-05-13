module com.example.harry_said_chaoui_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires lombok;

    opens com.example.harry_said_chaoui_fx to javafx.fxml;
    exports com.example.harry_said_chaoui_fx;
}