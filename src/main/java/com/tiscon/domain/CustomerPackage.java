package com.tiscon.domain;

import java.io.Serializable;

public class CustomerPackage implements Serializable {

    public CustomerPackage(Integer customerId, Integer packageId, Integer packageNumber) {
        this.customerId = customerId;
        this.packageId = packageId;
        this.packageNumber = packageNumber;
    }

    private int customerId;

    private int packageId;

    private int packageNumber;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }
}
