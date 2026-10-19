package designpatterns.ObserverPattern;

import designpatterns.ObserverPattern.Observable.WeatherStationClass;
import designpatterns.ObserverPattern.Observer.MobileDisplay;
import designpatterns.ObserverPattern.Observer.TVDisplay;

public class Main {
    public static void main(String[] args){
        WeatherStationClass weatherStationClass= new WeatherStationClass();
        MobileDisplay mobileDisplay =new MobileDisplay(weatherStationClass);

        TVDisplay tvDisplay= new TVDisplay(weatherStationClass);
        weatherStationClass.addtemp(mobileDisplay);
        weatherStationClass.addtemp(tvDisplay);

        weatherStationClass.setdata(25);
        weatherStationClass.removetemp(tvDisplay);
        weatherStationClass.setdata(35);




    }
}
