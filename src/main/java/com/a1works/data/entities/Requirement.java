package com.a1works.data.entities;

import javax.persistence.Entity;

@Entity
public class Requirement extends AbstractEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
