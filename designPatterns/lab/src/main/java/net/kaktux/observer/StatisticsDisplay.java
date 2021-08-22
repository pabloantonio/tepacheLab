package net.kaktux.observer;

public class StatisticsDisplay  implements Observer , DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay ( " + temperature + " º Celsius, " + humidity + " % Humedad , "+pressure+" [pa]  )" );
        
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display(); 
    }
    
}
