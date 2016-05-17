/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/16/16.
 */
public class Book {
    int pages;
    String author;
    String editor;
    int publishingDate;
    boolean haveRead;

    public Book(int pages, String author, String editor, int publishingDate, boolean haveRead) {
        this.pages = pages;
        this.author = author;
        this.editor = editor;
        this.publishingDate = publishingDate;
        this.haveRead = haveRead;
    }

    public Book(String author, String editor, int publishingDate) {
        this.author = author;
        this.editor = editor;
        this.publishingDate = publishingDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int newPages) {

        this.pages = pageVal(newPages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = AuthVal(newAuthor);
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }

    public boolean getHaveRead() {
        return haveRead;
    }

    public void setHaveRead(boolean haveRead) {
        this.haveRead = haveRead;
    }
//No one has time to be reading a novel that damn big, the author was merely inflating his ego and could sum it up in 600 pages or less
    public int pageVal(int newPages){
        if (newPages >= 2500){
            return 600;
        } else {
            return newPages;
        }
    }

// Checking for an entry
    public String AuthVal(String newAuth){
        if (newAuth.length() == 0){
            return "Unknown Author";
        } else{
            return newAuth;
        }
    }
}
