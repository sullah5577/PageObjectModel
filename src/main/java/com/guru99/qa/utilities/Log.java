package com.guru99.qa.utilities;

import org.apache.log4j.Logger;

public class Log {

    //Initialize Log4j instance
    private static Logger log = Logger.getLogger(Log.class.getName());

    //Test Start
    public static void startLog(String testClassName){
        log.info("Test is Starting...");
    }

    //Test End
    public static void endLog(String testClassName){
        log.info("Test is Ending...");
    }

    //Info level logs
    public static void info(String message){
        log.info(message);
    }

    //Warn level logs
    public static void warn(String message){
        log.warn(message);
    }

    //Error level logs
    public static void error(String message){
        log.error(message);
    }

    //Fatal level logs
    public static void fatal(String message){
        log.fatal(message);
    }

    //Debug level logs
    public static void debug(String message){
        log.debug(message);
    }
}
