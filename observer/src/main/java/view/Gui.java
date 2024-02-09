package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.WeatherStation;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Gui extends Application {
    private WeatherStation weatherStation;

    @Override
    public void start(Stage stage) {
        weatherStation = new WeatherStation();

        Thread t = new Thread(weatherStation);
        t.start();

        openWindow("Observer 1");
        openWindow("Weather 2");
        openWindow("Weather-Observer-3");

        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(this::removeObserverAfterDelay, 15, TimeUnit.SECONDS);
    }

    private void removeObserverAfterDelay() {
        weatherStation.removeObserver(weatherStation.getObservers().get(2));
        System.out.println("3rd observer removed!");
    }

    private void openWindow(String windowName) {
        Stage stage = new Stage();
        stage.setTitle(windowName);

        Label label = new WeatherObserverLabel(windowName, weatherStation);

        Scene scene = new Scene(label, 300, 50);

        stage.setScene(scene);
        stage.show();
    }
}
