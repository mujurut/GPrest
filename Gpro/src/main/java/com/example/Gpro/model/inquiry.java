package com.example.Gpro.model;

public class inquiry {
    private String searchString;

    public inquiry(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public inquiry() {
        //this.searchString = searchString;
    }
}
