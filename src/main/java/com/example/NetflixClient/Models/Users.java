package com.example.NetflixClient.Models;

public class Users {

    private int id;
    private int id_number;
    private String name;

    public Users(int id_number, String name) {
        this.id_number = id_number;
        this.name = name;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", id_number=" + id_number +
                ", name='" + name + '\'' +
                '}';
    }
}
