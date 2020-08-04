package com.app.model;

public class DataCountryModel {
    private int critical;
    private int death;
    private int recovered;
    private int total;
    private ChangedModel changed;
    private String type;

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ChangedModel getChanged() {
        return changed;
    }

    public void setChanged(ChangedModel changed) {
        this.changed = changed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
