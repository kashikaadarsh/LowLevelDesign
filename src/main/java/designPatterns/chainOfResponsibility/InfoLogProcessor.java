package designPatterns.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel, String message){
        if(logLevel==2){
            System.out.println("Info: "+ message);
        }
        else{
            super.log(logLevel, message);
        }

    }
}
