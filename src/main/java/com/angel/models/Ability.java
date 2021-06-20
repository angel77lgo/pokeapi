package com.angel.models;

public class Ability {
    String name;
    Boolean is_hidden;
    Integer slot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }
}
