/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;
import org.example.SmartPhone;
import org.example.WiredTelephone;

/**
 *
 * @author Максим
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант 2");
        System.out.println("Группа: РИБО-01-21");
        System.out.println("Монько Максим");

        System.out.println("Введите '1' для того чтобы создать проводной телефон или '2' для смартфона");
        String type = scanner();
        if(Integer.parseInt(type) == 1 ){
            System.out.println("Введите название телефона");
            String name = scanner();
            System.out.println("Введите дату создания");
            String date = scanner();
            System.out.println("Введите цену телефона");
            int cost = Integer.parseInt(scanner());
            System.out.println("Введите название модели");
            String model = scanner();
            System.out.println("Введите длинну телефонного кабеля");
            int wiredLength = Integer.parseInt(scanner());
            System.out.println("Есть ли функция изменения громкости(ввести в виде 1 или 0)");
            String volume = scanner();
            System.out.println("Есть ли функция определения номера(ввести в виде 1 или 0)");
            String call = scanner();
            WiredTelephone wiredPhone = new WiredTelephone(name,date,cost,model,volume,call);
            wiredPhone.getAll();
            System.out.println("Введите процент на который хотите изменить громкость");
            int changeVolume = Integer.parseInt(scanner());
            wiredPhone.changeVolume(changeVolume);

        }
        if(Integer.parseInt(type) == 2){
            System.out.println("Введите название телефона");
            String name = scanner();
            System.out.println("Введите дату создания");
            String date = scanner();
            System.out.println("Введите цену телефона");
            int cost = Integer.parseInt(scanner());
            System.out.println("Введите название модели");
            String model = scanner();
            System.out.println("Введите тип операционной системы");
            String OS = scanner();
            System.out.println("Введите объем аккамулятора");
            int batteryCapacity = Integer.parseInt(scanner());
            System.out.println("Введите разрешение экрана в дюймах");
            double screenResolution = Double.parseDouble(scanner());
            System.out.println("Введите герцовку экрана");
            int hertz = Integer.parseInt(scanner());
            SmartPhone smartPhone = new SmartPhone(name,date,cost,model);
            smartPhone.setBatteryCapacity(batteryCapacity);
            smartPhone.setHertzOfScreen(hertz);
            smartPhone.setScreenResolution(screenResolution);
            smartPhone.setOperationSystem(OS);
            smartPhone.getAll();
            smartPhone.chargeTime();
        }
    }

    private static String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}