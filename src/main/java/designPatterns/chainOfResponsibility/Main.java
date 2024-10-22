package designPatterns.chainOfResponsibility;

/*
* This is example of design pattern used in vending machines, ATM, logging process.
* In which ever scenario where the order of things does not matter
* */
public class Main {
    public static void main(String[] args){
        LogProcessor logObject = new InfoLogProcessor(new ErrorLogProcessor( new DebugLogProcessor(null)));

        logObject.log(LogProcessor.DEBUG, "There is a Debug Log");
        logObject.log(LogProcessor.ERROR, "This is an error log");
        logObject.log(LogProcessor.INFO,"This is an info log");

    }
}
