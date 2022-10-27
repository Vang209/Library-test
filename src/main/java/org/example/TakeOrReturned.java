package org.example;

public enum TakeOrReturned {
    TAKE("Взял"),
    RETURNED("Вернул");

    private String operation;

    TakeOrReturned(String operation){this.operation = operation;}

    public String getOperation(){return operation;}
}
