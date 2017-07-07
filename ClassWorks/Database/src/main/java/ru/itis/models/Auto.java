package ru.itis.models;

import com.google.common.base.MoreObjects;

/**
 * Created by Student16 on 07.07.2017.
 */
public class Auto {
    private int id;
    private String model;
    private String color;
    private int owner_id;

    public Auto() {
    }

    public Auto(int id, String model, String color, int owner_id) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.owner_id = owner_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("model", model)
                .add("color", color)
                .add("owner_id", owner_id)
                .toString();
    }
}
