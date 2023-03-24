package org.example;

public class WiredTelephone extends Telephone {
//    Длинна телефонного кабеля;
    private int lengthOfWired;

    private String volumeChanger;

    private String callerId;

    public WiredTelephone(String name, String dataOfCreate, int cost, String model,String volumeChanger, String callerId) {
        super(name, dataOfCreate, cost, model);
        this.volumeChanger = volumeChanger;
        this.callerId = callerId;
    }

    public int getLengthOfWired() {
        return lengthOfWired;
    }

    public String getVolumeChanger() {
        return volumeChanger;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setLengthOfWired(int lengthOfWired) {
        if(lengthOfWired < 0){
            System.out.println("Длина провода должна быть больше 0");
        } else {
            this.lengthOfWired = lengthOfWired;
        }

    }

    public void setVolumeChanger(String volumeChanger) {
        this.volumeChanger = volumeChanger;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public void callerIdOn() {
        if(this.callerId.equals("1")){
            System.out.println("Включен определитель номеров");
        } else{
            System.out.println("Определитель номеров отсутсвтует на данной моделе");
        }
    }
    public void changeVolume(int proponentOfVolume) {
        if(this.volumeChanger.equals("1")) {
            System.out.println("Уровень громкости установлен на "+proponentOfVolume+"%");
        } else{
            System.out.println("Изменение громкости отсутствует на данной модели");
        }
    }

    public void getAll() {
        System.out.println("Название телефона:"+getName());
        System.out.println("Модель телефона:"+getModel());
        System.out.println("Дата выпуска:"+ getDateOfCreate());
        System.out.println("Цена:"+getCost());
        System.out.println("Длина телефонного кабеля:"+getLengthOfWired());
        System.out.println("Возможность определять номер:"+getCallerId());
        System.out.println("Возможность изменить уровень громкости:"+getVolumeChanger());
    }
}
