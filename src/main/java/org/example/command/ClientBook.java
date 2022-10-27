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
        for (int i = 0; i < client.getClientList().size(); i++) {
            if (client.getClientList().get(i).equals(client)) {
                client.getClientList().get(i).serviceClient(books, client.getClientList().get(i));
            }
        }
    }

}
