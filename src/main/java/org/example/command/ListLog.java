package org.example.command;

import org.example.Log;

import java.util.List;

public class ListLog extends CommandAbstract{
    @Override
    public void Command(List books) {
    }

    @Override
    public void Command() {
        for (int i = 0; i< Log.logs.size(); i++){
            System.out.println(Log.logs.toString());
        }
    }
}
