package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@SuppressWarnings("unused")
public class StringFormatException extends Exception {
    public StringFormatException(String message) throws StringFormatException {
        // TODO: please modify the following code to pass the test
        // <--start
        super(message);
        // --end-->
    }

    public StringFormatException(String message, Throwable cause) {
        // TODO: please modify the following code to pass the test
        // <--start
        super(message, cause);
        // --end-->
    }
}
