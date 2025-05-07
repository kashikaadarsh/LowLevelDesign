package designPatterns.obeserverPattern;

public class TemperatureObserverSystem {
    public static void main(String [] args){
        TemperatureUpdater observer = new TemperatureUpdater();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        EmailDisplay emailDisplay = new EmailDisplay();
        observer.addObservers(phoneDisplay);
        observer.addObservers(emailDisplay);
        observer.setTemperature(12);
        observer.setTemperature(2);
    }
}
