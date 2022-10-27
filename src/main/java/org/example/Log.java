package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Log implements Serializable {
    public static List<Log> logs = new ArrayList<>();
    private Book book;
    private UUID clientId;
    private String takeOrReturned;
    private Date date;


    @Override
    public String toString() {
        return "Log{" +
                "book=" + book +
                ", clientId=" + clientId +
                ", takeOrReturned='" + takeOrReturned + '\'' +
                ", date=" + date +
                '}';
    }

    public Log(Book book, UUID clientId, String takeOrReturned, Date date){
        this.book = book;
        this.clientId = clientId;
        this.takeOrReturned = takeOrReturned;
        this.date = date;
    }

    public String getTakeOrReturned() {
        return takeOrReturned;
    }

    public void setTakeOrReturned(String takeOrReturned) {
        this.takeOrReturned = takeOrReturned;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
