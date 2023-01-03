package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
//        Создайте класс Автомобиля. Он должен хранить
//информацию о названии автомобиля, год выпуска, цена,
//цвет, объем двигателя. Нужно создать набор автомобилей
//и выполнить следующие задачи:
//■ Показать все автомобили;
//■ Показать все автомобили заданного цвета;
//■ Показать все автомобили заданного объёма;
//■ Показать все автомобили дороже заданной цены;
//■ Показать все автомобили чей год выпуска находится
//в указанном диапазоне

        List<Car> cars = new ArrayList<>(List.of(
                new Car("BMV",2007,2333444.25,"black", 3.2),
                new Car("Ford",2007,200200.25,"black", 3.2),
                new Car("BMV",2005,2333000.25,"green", 3.0),
                new Car("Ford",2005,2200000.25,"white", 3.0),
                new Car("Opel",2007,1300000.00,"red", 2.8),
                new Car("Opel",2003,1000000.25,"blue", 2.8)
        ));

//■ Показать все автомобили;
        cars.stream()
                .forEach(System.out::println);

        Scanner scan = new Scanner(System.in);

//■ Показать все автомобили заданного цвета;
        System.out.println("Введите цвет: ");
        String color = scan.nextLine();
        cars.stream()
                .filter(n->n.getColor().equals(color))
                .forEach(System.out::println);

//■ Показать все автомобили заданного объёма;
        System.out.println("Введите объем: ");
        double volume = Double.parseDouble(scan.nextLine());
        cars.stream()
                .filter(n->n.getVolume()==volume)
                .forEach(System.out::println);

//■ Показать все автомобили дороже заданной цены;
        System.out.println("Введите цену: ");
        double price = Double.parseDouble(scan.nextLine());
        cars.stream()
                .filter(n->n.getPrice()>price)
                .forEach(System.out::println);

//■ Показать все автомобили чей год выпуска находится
//в указанном диапазоне
        System.out.println("Введите интервал года выпуска: с ");
        int nach = Integer.parseInt(scan.nextLine());
        System.out.println("по ");
        int kon = Integer.parseInt(scan.nextLine());
        cars.stream()
                .filter(n->n.getYear()>=nach && n.getYear()<=kon)
                .forEach(System.out::println);
    }
}
