package com.example.api_andro;

import java.io.Serializable;

public class PlayerItem implements Serializable {
    String poster, id, name, description, price, slug;

    public PlayerItem(String poster, String id, String name, String description, String price, String slug ) {
        this.poster = poster;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.slug = slug;
    }

    public String getPoster(){
        return poster;
    }

    public String getNo() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getPrice(){
        return price;
    }

    public String getSlug() {
        return slug;
    }
}
