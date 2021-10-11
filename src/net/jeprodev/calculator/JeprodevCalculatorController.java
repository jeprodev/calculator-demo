package net.jeprodev.calculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.net.URL;
import java.util.ResourceBundle;

public class JeprodevCalculatorController implements Initializable {
    @FXML private VBox jeproCalculatorWrapper;
    @FXML private Button calculatorEqualOperator, calculatorAdditionOperator, calculatorSubtractOperator,
            calculatorMultiplyOperator, calculatorDivideOperator, calculatorModularOperator,
            calculatorExponentialOperator, calculatorSuppressOperator, calculatorClearOperator, calculatorPiValue,
            calculatorSecondOperator, calculatorPowerThreeOperator, calculatorInverseOperator,
            calculatorAbsoluteOperator, calculatorFactorialOperator, calculatorLeftParenthesisOperator,
            calculatorRightParenthesisOperator, calculatorCommaOperator, calculatorNaturalLogarithmOperator,
            calculatorCubicSquareRootOperator, calculatorPowerOfTenOperator, calculatorLogarithmOperator,
            calculatorPowerOfXToYOperator, calculatorNegationOperator;
    @FXML private Button calculatorZeroValue, calculatorOneValue, calculatorTwoValue, calculatorThreeValue,
            calculatorFourValue, calculatorFiveValue, calculatorSixValue, calculatorSevenValue, calculatorEightValue,
            calculatorNineValue, calculatorNaturalLogarithmBaseValue; //, calculatorValue, calculatorValue, calculatorValue, calculatorValue;
    @FXML private GridPane calculatorLayout;
    @FXML private Label calculatorTextField;

    public void initialize(URL location, ResourceBundle bundle){
        ObservableList<Button> calculatorCommands = FXCollections.observableArrayList();

        calculatorCommands.setAll(
                calculatorEqualOperator, calculatorAdditionOperator, calculatorSubtractOperator,
                calculatorMultiplyOperator, calculatorDivideOperator, calculatorModularOperator,
                calculatorExponentialOperator, calculatorSuppressOperator, calculatorClearOperator,
                calculatorPiValue, calculatorSecondOperator, calculatorPowerThreeOperator,
                calculatorInverseOperator, calculatorAbsoluteOperator, calculatorFactorialOperator,
                calculatorLeftParenthesisOperator, calculatorRightParenthesisOperator, calculatorZeroValue,
                calculatorOneValue, calculatorTwoValue, calculatorThreeValue, calculatorFourValue,
                calculatorFiveValue, calculatorSixValue, calculatorSevenValue, calculatorEightValue,
                calculatorNineValue, calculatorCommaOperator, calculatorNaturalLogarithmOperator,
                calculatorNaturalLogarithmBaseValue, calculatorCubicSquareRootOperator, calculatorPowerOfTenOperator,
                calculatorLogarithmOperator, calculatorPowerOfXToYOperator, calculatorNegationOperator
        );

        double buttonSize = 40;
        calculatorCommands.forEach(item -> {
            item.setMinSize(buttonSize, buttonSize);
            item.setMaxSize(buttonSize, buttonSize);
            item.setPrefSize(buttonSize, buttonSize);
            GridPane.setMargin(item, new Insets(5));
        });

        VBox.setMargin(calculatorTextField, new Insets(5));
        VBox.setMargin(calculatorLayout, new Insets(0, 5, 5, 5));

        calculatorTextField.setMinSize((buttonSize * 5), 30);
        calculatorTextField.setMaxSize((buttonSize * 5) , 30);
        calculatorTextField.setPrefSize((buttonSize * 5), 30);
        calculatorTextField.setFont(Font.font(calculatorTextField.getFont().getFamily(), FontWeight.MEDIUM, 20));

        setLabels();

        addEventListeners();
    }

    private void setLabels(){
        calculatorPiValue.setText("\u03C0");
    }

    private void addEventListeners(){
        calculatorPowerOfTenOperator.setOnAction(event -> {});
        calculatorLogarithmOperator.setOnAction(event -> {});
        calculatorPowerOfXToYOperator.setOnAction(event -> {});
        calculatorNegationOperator.setOnAction(event -> {});
        calculatorEqualOperator.setOnAction(event -> {});
        calculatorAdditionOperator.setOnAction(event -> {});
        calculatorSubtractOperator.setOnAction(event -> {});
        calculatorMultiplyOperator.setOnAction(event -> {});
        calculatorDivideOperator.setOnAction(event -> {});
        calculatorModularOperator.setOnAction(event -> {});
        calculatorExponentialOperator.setOnAction(event -> {});
        calculatorSuppressOperator.setOnAction(event -> {});
        calculatorClearOperator.setOnAction(event -> {});
        calculatorPiValue.setOnAction(event -> {});
        calculatorSecondOperator.setOnAction(event -> {});
        calculatorPowerThreeOperator.setOnAction(event -> {});
        calculatorInverseOperator.setOnAction(event -> {});
        calculatorAbsoluteOperator.setOnAction(event -> {});
        calculatorFactorialOperator.setOnAction(event -> {});
        calculatorLeftParenthesisOperator.setOnAction(event -> {});
        calculatorRightParenthesisOperator.setOnAction(event -> {});
        calculatorZeroValue.setOnAction(event -> {});
        calculatorOneValue.setOnAction(event -> {});
        calculatorTwoValue.setOnAction(event -> {});
        calculatorThreeValue.setOnAction(event -> {});
        calculatorFourValue.setOnAction(event -> {});
        calculatorFiveValue.setOnAction(event -> {});
        calculatorSixValue.setOnAction(event -> {});
        calculatorSevenValue.setOnAction(event -> {});
        calculatorEightValue.setOnAction(event -> {});
        calculatorNineValue.setOnAction(event -> {});
        calculatorCubicSquareRootOperator.setOnAction(event -> {});
    }
}