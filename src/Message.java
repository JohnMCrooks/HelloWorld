/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/17/16.
 */
public class Message {
    String subject;
    String body;
    String destination;
    int time;
    Person author;

    public Message(Person author, String subject, String body, String destination, int time){
        this.subject = subject;
        this.author = author;
        this.body = body;
        this.destination = destination;
        this.time = time;
    }
    public Message(String subject, String body, String destination) {
        this.author = null;
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.time = 0;

    }

    public String getSubject() {
        return subject;
    }

    // Use the body for your message not the Subject line!!!
    public void setSubject(String newSubject) {
        if (subjectLength(newSubject)){
            this.subject = newSubject;
        } else {
            this.subject = newSubject.substring(0,29);
        }
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public static boolean subjectLength(String newSubject){
        if (newSubject.length() <= 30){
            return true;
        }else {
            return false;
        }
    }
}
