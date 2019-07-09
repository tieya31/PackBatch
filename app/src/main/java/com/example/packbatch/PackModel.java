package com.example.packbatch;

public class PackModel {
    private String orderID;
    private String status;
    private String pickby;
    private String packed;

    public String getPacked() {
        return packed;
    }

    public void setPacked(String packed) {
        this.packed = packed;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPickby() {
        return pickby;
    }

    public void setPickby(String pickby) {
        this.pickby = pickby;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

