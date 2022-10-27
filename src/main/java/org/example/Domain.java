package org.example;

import java.io.Serializable;
import java.util.List;

public class Domain implements Serializable {
    List<Book> bookList;
    List<Client> clientList;
    List<Log> logList;

    public Domain(List<Book> bookList, List<Client> clientList, List<Log> logList){
        this.bookList = bookList;
        this.clientList = clientList;
        this.logList = logList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Log> getLogList() {return logList;}

    public void setLogList(List<Log> logList) {
        this.logList = logList;
    }
}
