package org.example;

public class SmartPhone extends Telephone {
    private String operationSystem;

    private int batteryCapacity;

    private double screenResolution;

    private int hertzOfScreen;

    public SmartPhone(String name, String dataOfCreate, int cost, String model) {
        super(name, dataOfCreate, cost, model);
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getScreenResolution() {
        return screenResolution;
    }

    public int getHertzOfScreen() {
        return hertzOfScreen;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        if(batteryCapacity <= 0){
            System.out.println("Объем батареи должен быть больше 0");
        } else {
            this.batteryCapacity = batteryCapacity;
        }

    }

    public void setScreenResolution(double screenResolution) {
        if(screenResolution <= 0){
            System.out.println("Разрешение экрана должно быть больше 0");
        } else {
            this.screenResolution = screenResolution;
        }

    }

    public void setHertzOfScreen(int hertzOfScreen) {
        if(hertzOfScreen <= 0) {
            System.out.println("Герцовка экрана должна быть больше 0");
        } else {
            this.hertzOfScreen = hertzOfScreen;
        }

    }

    public void chargeTime() {
        double time = Math.floor((1.4*this.batteryCapacity)/900);
        System.out.println("Время до полного заряда телефона: "+time);
    }

    public void downloadProgram(String name) {
        System.out.println("Выполняется установка программы: "+name);
    }

    public void getAll() {
        System.out.println("Название телефона:"+getName());
        System.out.println("Модель телефона:"+getModel());
        System.out.println("Дата выпуска:"+ getDateOfCreate());
        System.out.println("Цена:"+getCost());
        System.out.println("Объем аккамулятора:"+getBatteryCapacity());
        System.out.println("Тип операционной системы:"+getOperationSystem());
        System.out.println("Разрешение экрана:"+getScreenResolution());
        System.out.println("Герцовка экрана:"+getHertzOfScreen());

    }

}
