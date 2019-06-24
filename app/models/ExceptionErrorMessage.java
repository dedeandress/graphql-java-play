package models;

public class ExceptionErrorMessage {
    private final String statusCode;
    private final String message;

    public ExceptionErrorMessage(String statusCode, String message){
        this.statusCode = statusCode;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
