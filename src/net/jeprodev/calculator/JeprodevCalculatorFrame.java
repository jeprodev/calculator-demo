package net.jeprodev.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.jeprodev.updater.ApplicationUpdater;
import net.jeprodev.updater.release.ApplicationRelease;
import net.jeprodev.updater.release.ReleaseFactory;

import java.io.File;

public class JeprodevCalculatorFrame extends Application {
    private final ApplicationUpdater updater = new ApplicationUpdater();

    private ApplicationRelease release;

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("forms/calculator.fxml"));
        release = ReleaseFactory.create(getManifestFile());
        if(release != null) {
            updater.setApplicationRelease(release);
        }

        Parent container = loader.load();

        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.show();
    }

    private File getManifestFile(){
        File mainAppFile = new File(JeprodevCalculatorFrame.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String manifestPath = mainAppFile.getParentFile().getPath() + File.separator + "config" +
                File.separator + "calculator.json";
        return new File(manifestPath);
    }

    public static void main(String[] args){
        launch(JeprodevCalculatorFrame.class, args);
    }
}