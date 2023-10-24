package org.example;

public class Goods {
    private String name;
    private String id;
    private int number;

    public Goods() {
    }

    public Goods(String name, String id, int number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }
}
