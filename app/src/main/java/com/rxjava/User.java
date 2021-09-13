package com.rxjava;

import androidx.annotation.NonNull;

class User {

    private String Name;
    private String gender;
    private String mail;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @NonNull
    @Override
    public String toString() {
        return "name "+ Name + " gender " + gender + " mail "+mail + " address " +address.toString();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
