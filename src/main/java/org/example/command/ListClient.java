package org.example.command;

import org.example.Client;
import java.util.List;

public class ListClient extends CommandAbstract{

    @Override
    public void Command(List books) {

    }

    @Override
    public void Command() {
        Client client = new Client(Client.getClientNameForMyBooks());
        List<Client> clientList = client.getClientList();
        for (int i=0;i<clientList.size();i++){
            System.out.println(clientList.get(i).nameClient);
        }
    }
}
