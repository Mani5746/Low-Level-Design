package designpatterns.ObserverPattern.Observable;

import designpatterns.ObserverPattern.Observer.DisplayScreen;

public interface WeatherStation {

   public void addtemp(DisplayScreen displayScreen);
    public  void removetemp(DisplayScreen displayScreen);
    public  void notifytemp();

    public void setdata(int data);
    public  int  getdata();
}
