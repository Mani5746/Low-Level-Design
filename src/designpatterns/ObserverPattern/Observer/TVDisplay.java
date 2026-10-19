package designpatterns.ObserverPattern.Observer;

import designpatterns.ObserverPattern.Observable.WeatherStation;

public class TVDisplay implements DisplayScreen {
    private final WeatherStation weatherStation;

    public TVDisplay(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }
    @Override
    public void update() {
        System.out.println("TV: "+weatherStation.getdata());
    }
}
