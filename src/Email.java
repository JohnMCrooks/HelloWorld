/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/26/16.
 */
public class Email {
    String subject;
    String body;
    String destination;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Email(String subject, String body, String destination) {

        this.subject = subject;
        this.body = body;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
