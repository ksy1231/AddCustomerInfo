package org.techtown.addcustomerinfo;

public class CustomerItem {

    String name, phone, day;

    public CustomerItem(String name, String day, String phone) {
        this.name = name;
        this.day = day;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
