package com.dubey.Workwhiz.response;



public class MessageResponse {
    private String message;

    // No-args constructor
    public MessageResponse() {}

    // All-args constructor
    public MessageResponse(String message) {
        this.message = message;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // toString method
    @Override
    public String toString() {
        return "MessageResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    // hashCode and equals methods (optional)
    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        MessageResponse that = (MessageResponse) obj;
        return message != null ? message.equals(that.message) : that.message == null;
    }
}
