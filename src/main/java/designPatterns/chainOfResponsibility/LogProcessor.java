package designPatterns.chainOfResponsibility;

public abstract  class LogProcessor {
    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;
    LogProcessor nextLogProcessor;
    LogProcessor( LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message){
        if (nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);

        }

    }

    }

