package org.example;

public class Telephone {
//    Название телефона (Samsung,Iphone)
    private String name;
    private String dateOfCreate;
    private int cost;
//    Модель телефона(name:Iphone,model:12)
    private String model;

//    Номер телефона 88005555555
    private int telephoneCall;

    public Telephone(String name, String dateOfCreate, int cost, String model) {
        this.name = name;
        this.dateOfCreate = dateOfCreate;
        this.cost = cost;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getDateOfCreate() {
        return dateOfCreate;
    }

    public Number getCost() {
        return cost;
    }

    public String getModel() {
        return model;
    }

    public int getTelephoneCall() {
        return telephoneCall;
    }

    public void setTelephoneCall(int telephoneCall) {
        this.telephoneCall = telephoneCall;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfCreate(String dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public void setCost(int cost) {
        if(cost < 1) {
            System.out.println("Цена должна быть больше 0");
            return;
        }
        this.cost = cost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void call(String telephone) {
        System.out.println("Происходит звонок на телефон "+telephone);
    }

    public void acceptCall() {
        System.out.println("Вызов принят");
    }

    public void rejectCall() {
        System.out.println("Вызов отклонен");
    }
}
