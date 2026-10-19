package designpatterns.ObserverPattern.Observer;

import designpatterns.ObserverPattern.Observable.WeatherStation;

public class MobileDisplay implements DisplayScreen {
   private final WeatherStation weatherStation;

    public MobileDisplay(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }
    @Override
    public void update() {
       System.out.println("Mobile: "+weatherStation.getdata());

    }
}
