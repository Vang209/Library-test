package org.example;

import java.io.Serializable;
import java.util.*;

public class Client implements Serializable {


    UUID uuid = UUID.randomUUID();
    public String nameClient;
    public UUID getUuid(){return uuid;}
    public void setUuid(UUID uuid) {this.uuid = uuid;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nameClient, client.nameClient);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameClient, uuid);
    }

    public Client(String nameClient){
        this.nameClient=nameClient;
    }

    public static List<Client> clientList = new ArrayList<>();

    public static String getClientNameForMyBooks() {
        return clientNameForMyBooks;
    }

    public static void setClientNameForMyBooks(String clientNameForMyBooks) {
        Client.clientNameForMyBooks = clientNameForMyBooks;
    }

    private static String clientNameForMyBooks;
}