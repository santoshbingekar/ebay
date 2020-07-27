package eBay.logging;

/*
* The VerificationFail exception is thrown when verification is failed.
*/
public class VerificationFailException extends Exception{
    public VerificationFailException(String message) {
        super(message);
    }
}
