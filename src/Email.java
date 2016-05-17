/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/17/16.
 */
public class Email {
    String subject;
    String body;
    String destination;
    int time;
    Person author;

    public Email(Person author, String subject, String body, String destination, int time){
        this.subject = subject;
        this.author = author;
        this.body = body;
        this.destination = destination;
        this.time = time;
    }
    public Email(String subject, String body, String destination) {
        this.author = null;
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.time = 0;

    }
}
