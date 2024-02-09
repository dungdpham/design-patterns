package view;

import javafx.application.Platform;
import javafx.scene.control.Label;
import model.WeatherStation;

public class WeatherObserverLabel extends Label implements Observer {
    private WeatherStation observable;
    private String name;

    public WeatherObserverLabel(String name, WeatherStation observable) {
        //super(name);
        this.observable = observable;
        observable.addObserver(this);
        this.name = name;

        update();
    }

    @Override
    public void update() {
        Platform.runLater(() -> setText(name + " update: " + observable.getTemperature() + " degree."));
    }
}
