package net.kaktux.observer;

public class WheatherStationUpdate {

    public static void main(String[] args) {
        WeatherDataUpdate weatherData = new WeatherDataUpdate();
        CurrentConditionsDisplayUpdate currentConditionsDisplay = new CurrentConditionsDisplayUpdate(weatherData);
        ForecastDisplayUpdate forecastDisplayUpdate = new ForecastDisplayUpdate(weatherData); 
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);

    }
    
}
