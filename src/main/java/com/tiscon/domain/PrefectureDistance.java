package com.tiscon.domain;

import java.io.Serializable;

public class PrefectureDistance implements Serializable {

    private String prefectureIdFrom;

    private String prefectureIdTo;

    private double distance;

    public String getPrefectureIdFrom() {
        return prefectureIdFrom;
    }

    public void setPrefectureIdFrom(String prefectureIdFrom) {
        this.prefectureIdFrom = prefectureIdFrom;
    }

    public String getPrefectureIdTo() {
        return prefectureIdTo;
    }

    public void setPrefectureIdTo(String prefectureIdTo) {
        this.prefectureIdTo = prefectureIdTo;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
