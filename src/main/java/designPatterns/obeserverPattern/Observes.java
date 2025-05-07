package designPatterns.obeserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface Observes {
    float temperature = 0;
    List<Observer> observers = new ArrayList<>();


    public void setTemperature(float temperature);
    public void notifyObservers();
    public float getTemperature();

}
