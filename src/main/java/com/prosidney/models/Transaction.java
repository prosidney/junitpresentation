package com.prosidney.models;

/**
 * Created by admin on 15/05/2017.
 */
public class Transaction {
    private Integer id;
    private String name;

    public Transaction() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
