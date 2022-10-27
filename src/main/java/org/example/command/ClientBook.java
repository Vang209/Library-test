package org.example.command;

import org.example.Book;
import org.example.Client;

import java.util.List;

public class ClientBook extends CommandAbstract{
    Client client = new Client(Client.getClientNameForMyBooks());
    @Override
    public void Command() {
    }
    @Override
    public void Command(List books) {
        for (int i = 0; i < Client.clientList.size(); i++) {
            if (Client.clientList.get(i).equals(client)) {
                Client.clientList.get(i).serviceClient(books, Client.clientList.get(i));
            }
        }
    }

}
