package designPatterns.obeserverPattern;

public class EmailDisplay implements Observer{
    @Override
    public void update(float temperature){
        System.out.println("Email temperature updated - "+ temperature);
    }
}
