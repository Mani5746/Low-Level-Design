package designpatterns.ObserverPattern.Observable;

import designpatterns.ObserverPattern.Observer.DisplayScreen;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationClass implements WeatherStation {
  private List<DisplayScreen> displayScreens= new ArrayList<>();
  private int temperature=0;


    @Override
    public void addtemp(DisplayScreen displayScreen) {
        displayScreens.add(displayScreen);
    }

    @Override
    public void removetemp(DisplayScreen displayScreen) {
        displayScreens.remove(displayScreen);
    }

    @Override
    public void notifytemp() {
         for(DisplayScreen obj: displayScreens){
              obj.update();
         }
    }

    @Override
    public void setdata(int data) {
        temperature=data;
        notifytemp();
    }

    @Override
    public int getdata() {
     return temperature;
    }
}
