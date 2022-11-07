package org.example.command;

import org.example.Book;
import org.example.Client;
import org.example.ClientInterface;

import java.util.List;

public class ClientBook extends CommandAbstract{
    Client client = new Client(Client.getClientNameForMyBooks());
    @Override
    public void Command() {
    }
    @Override
    public void Command(List books) {
        ClientInterface clientInterface = new ClientInterface();
        for (int i = 0; i < Client.clientList.size(); i++) {
            if (Client.clientList.get(i).equals(client)) {
                clientInterface.serviceClient(books, Client.clientList.get(i));
            }
        }
    }

}
