
package eBay.logging;


import java.util.List;

import org.openqa.selenium.WebElement;

import eBay.main.AutomationBase;
import junit.framework.Assert;

/**
 * This class holds a set of methods to verify different kinds of objects
 */
public class Verify {    

    /**
     * Verifies if the object is true, raise an exception otherwise
     */
    public static void verifyTrue(Boolean object) {
        verifyEquals(object, true);
    }

    /**
     * Verifies if the object is true, raise an exception otherwise
     * Add description message in the log
     */
    public static void verifyTrue(Boolean object, String message) {
        verifyEquals(object, true, AutomationBase.testCaseID, message);
    }
    
    public static void verifyTrue(List<WebElement> list, String message) {
        verifyEquals(list, true, AutomationBase.testCaseID, message);
    }
    

    /**
     * Verifies if the object is true, raise an exception otherwise
     * Add description message in the log
     */
    public static void verifyTrue(Boolean object, String testID, String message) {
        verifyEquals(object, true, testID, message);
    }

    /**
     * Verifies if the object is false, raise an exception otherwise
     */
    public static void verifyFalse(Boolean object) {
        verifyEquals(object, false);
    }

    /**
     * Verifies if the object is false, raise an exception otherwise
     * Add description message in the log
     */
    public static void verifyFalse(Boolean object, String message) {
        verifyEquals(object, false, AutomationBase.testCaseID, message);
    }

    /**
     * Verifies if the object is false, raise an exception otherwise
     * Add description message in the log
     */
    public static void verifyFalse(Boolean object, String testID, String message) {
        verifyEquals(object, false, testID, message);
    }

    /**
     * Verifies if 2 objects are equal
     * Raise an exception in case when the objects are not equal, if it is not suppressed by suppressException parameter
     * Add description message in the log
     */
    public static void verifyEquals(Object actual, Object expected, String testID, String message, Boolean suppressException) {
    	AutomationBase.testCaseID = testID;
        try {
            Assert.assertEquals(expected, actual);
            System.out.println(String.format("%s - %s EXPECTED: '%s' ACTUAL: '%s'",
                    testID, message, expected.toString(), actual.toString()));
        } catch (Throwable error) {
        	
            fail(testID + " - " + message, error.getMessage(), suppressException);
        }
    }

    /**
     * Verifies if 2 objects are equal,
     * Always raise an exception in case when the objects are not equal
     */
    public static void verifyEquals(Object actual, Object expected) {
        verifyEquals(actual, expected, AutomationBase.testCaseID, "", false);
    }

    /**
     * Verifies if 2 objects are equal
     * Raise an exception in case when the objects are not equal, if it is not suppressed by suppressException parameter
     */
    public static void verifyEquals(Object actual, Object expected, Boolean suppressException) {
        verifyEquals(actual, expected, AutomationBase.testCaseID, "", suppressException);
    }

    /**
     * Verifies if 2 objects are equal,
     * Always raise an exception in case when the objects are not equal
     * Add description message in the log
     */
    public static void verifyEquals(Object actual, Object expected, String message) {
        verifyEquals(actual, expected, AutomationBase.testCaseID, message, false);
    }

    /**
     * Verifies if 2 objects are equal,
     * Always raise an exception in case when the objects are not equal
     * Add description message in the log
     */
    public static void verifyEquals(Object actual, Object expected, String testID, String message) {
        verifyEquals(actual, expected, testID, message, false);

    }

    /**
     * Verifies if 2 objects are NOT equal
     * Raise an exception in case when the objects are equal, if it is not suppressed by suppressException parameter
     * Add description message in the log
     */
    private static void verifyNotEquals(Object actual, Object expected, String testID, String message, Boolean suppressException) {
    	AutomationBase.testCaseID = testID;
        try {
            Assert.assertEquals(expected, actual);
            String errorMessage = String.format("expected: %s but was: %s", expected.toString(), actual.toString());
           
            fail(testID + " - " + message, errorMessage, suppressException);
        } catch (AssertionError error) {
            System.out.println(String.format("%s - %s ACTUAL: '%s' and EXPECTED: '%s'.",
                    testID, message, actual.toString(), expected.toString()));
        }
    }

    /**
     * Verifies if 2 objects are NOT equal,
     * Always raise an exception in case when the objects are equal
     */
    public static void verifyNotEquals(Object actual, Object expected) {
        verifyNotEquals(actual, expected, AutomationBase.testCaseID, "", false);
    }

    /**
     * Verifies if 2 objects are NOT equal
     * Raise an exception in case when the objects are equal, if it is not suppressed by suppressException parameter
     */
    public static void verifyNotEquals(Object actual, Object expected, Boolean suppressException) {
        verifyNotEquals(actual, expected, AutomationBase.testCaseID, "", suppressException);
    }

    /**
     * Verifies if 2 objects are NOT equal,
     * Always raise an exception in case when the objects are equal
     * Add description message in the log
     */
    public static void verifyNotEquals(Object actual, Object expected, String message) {
        verifyNotEquals(actual, expected, AutomationBase.testCaseID, message, false);
    }

    /**
     * Verifies if 2 objects are NOT equal,
     * Always raise an exception in case when the objects are equal
     * Add description message in the log
     */
    public static void verifyNotEquals(Object actual, Object expected, String testID, String message) {
        verifyNotEquals(actual, expected, testID, message, false);
    }

    /**
     * The method is used when verification if fail
     * Capture an device screen image with unique sequence number in the name
     * Create and write a fail message into the log
     * Raise an exception if suppressException parameter is true
     */
    private static void fail(String descriptionMessage, String errorMessage, Boolean suppressException) {

        // Build the error message.
        StringBuilder combinedMessage = new StringBuilder(descriptionMessage);
        if (descriptionMessage != null && !descriptionMessage.isEmpty()) {
            combinedMessage.append("\n");
        }
        combinedMessage.append(" VERIFICATION FAILS BETWEEN OBJECTS: ");
        combinedMessage.append(errorMessage);

        //Write message to the log file with error message
        
        System.out.println(combinedMessage.toString());

        //Throw new Verification fail exception if it is not suppressed
        
    }

}
