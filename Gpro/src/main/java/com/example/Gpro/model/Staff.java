package com.example.Gpro.model;

public class Staff {
    public int id;
    public String name;
    public String url;
    public String description;

    public int getId() {
        return id;
    }

    public Staff(int id, String url, String name, String description) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
