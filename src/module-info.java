module jeprodev.calculator{
    requires java.base;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;

    requires jeprodev.updater;

    exports net.jeprodev.calculator;

    opens net.jeprodev.calculator to javafx.fxml;
    opens net.jeprodev.calculator.forms to javafx.fxml;
    //exports net.jeprodev.calculator.forms;
}