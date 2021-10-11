package net.jeprodev.calculator;

import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;

import java.util.concurrent.TimeoutException;

public abstract class AbstractCalculatorTest extends ApplicationTest {
    @Before
    public void setupClass() throws Exception{
        ApplicationTest.launch(JeprodevCalculatorFrame.class);
    }

    @Override
    public void start(Stage stage) throws Exception{
        stage.show();
    }

    @After
    public void afterEachTest() throws TimeoutException{
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    public <N extends Node> N find(final String query){
        return (N) lookup(query).queryAll().iterator().next();
    }
}
