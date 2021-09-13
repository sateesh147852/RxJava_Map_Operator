package com.rxjava;

import androidx.annotation.NonNull;

class Address {

    private String address;

    @NonNull
    @Override
    public String toString() {
        return address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
