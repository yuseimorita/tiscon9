package com.tiscon.dto;

public class PriceDto {
    private int priceForDistance;
    private int pricePerTruck;
    private double multiplier;
    private int priceForOptionalService;
    private int total;

    public int getPriceForDistance() {
        return priceForDistance;
    }
    public int getPricePerTruck() {
        return pricePerTruck;
    }
    public double getMultiplier() {
        return multiplier;
    }
    public int getPriceForOptionalService() {
        return priceForOptionalService;
    }
    public int getTotal() {
        return total;
    }

    public void setPriceForDistance(int priceForDistance) {
        this.priceForDistance = priceForDistance;
    }
    public void setPricePerTruck(int pricePerTruck) {
        this.pricePerTruck = pricePerTruck;
    }
    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }
    public void setPriceForOptionalService(int priceForOptionalService) {
        this.priceForOptionalService = priceForOptionalService;
    }
    public void setTotal(int total) {
        this.total = total;
    }
}
