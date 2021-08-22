package net.kaktux.observer;

import java.util.Observable;
import java.util.Observer;



public class CurrentConditionsDisplayUpdate implements Observer , DisplayElement{

    Observable observable;
    private float temperature; 
    private float humidity;


    public CurrentConditionsDisplayUpdate(Observable observable){
            this.observable = observable;
            this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplayUpdate : ("+ temperature+ "F degrees and " + humidity + "% humidity )" );
    }

    @Override
    public void update(Observable o, Object arg) {
        if( o instanceof WeatherDataUpdate){
            WeatherDataUpdate wheatherDataUpdate = (WeatherDataUpdate) o;
            this.temperature = wheatherDataUpdate.getTemperature();
            this.humidity = wheatherDataUpdate.getHumidity();
            display();
        }
    }
    
}
