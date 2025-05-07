package designPatterns.obeserverPattern;

import java.util.ArrayList;
import java.util.List;

public class TemperatureUpdater implements Observes{
    private float temperature = 0;
    List<Observer> observers = new ArrayList<>();
    @Override
    public void setTemperature(float temperature){
        this.temperature = temperature;
        this.notifyObservers();
    }
    public float getTemperature(){
        return this.temperature;
    }
    public void notifyObservers(){
        for(Observer o: this.observers){
            o.update(this.temperature);
        }
    }
    public void addObservers(Observer observer){
        this.observers.add(observer);
    }
}
