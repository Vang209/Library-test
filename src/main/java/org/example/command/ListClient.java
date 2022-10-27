package org.example.command;

import org.example.Client;
import java.util.List;

public class ListClient extends CommandAbstract{

    @Override
    public void Command(List books) {

    }

    @Override
    public void Command() {
        List<Client> clientList = Client.clientList;
        for (int i=0;i<clientList.size();i++){
            System.out.println(clientList.get(i).nameClient);
        }
    }
}
