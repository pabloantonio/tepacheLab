package net.kaktux.observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplayUpdate implements Observer, DisplayElement {

    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplayUpdate(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "ForecastDisplayUpdate : (" + currentPressure + "[Pa] " + lastPressure + "[Pa] lastPressure )");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataUpdate) {
            WeatherDataUpdate weatherDataUpdate = (WeatherDataUpdate) o;
            lastPressure = currentPressure;
            currentPressure = weatherDataUpdate.getPressure();
            display();
        }

    }

}
