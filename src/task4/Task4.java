package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Создайте класс Телевизор. Он должен хранить информацию о названии
//        модели, год выпуска, цена, диагональ, производитель.
//        Нужно создать набор телевизоров
//и выполнить следующие задачи:

//■ Показать все телевизоры;
//■ Показать телевизоры с заданной диагональю;
//■ Показать все телевизоры одного производителя;
//■ Показать все телевизоры текущего года;
//■ Показать все телевизоры дороже заданной цены;
//■ Показать все телевизоры, отсортированные по цене
//по возрастанию;
//■ Показать все телевизоры, отсортированные по цене
//по убыванию.

//Практические задания
//2
//■ Показать все телевизоры, отсортированные по диагонали по возрастанию;
//■ Показать все телевизоры, отсортированные по диагонали по убыванию.


        List<TV> tvset =  new ArrayList<>(List.of(
                new TV("Samsung", 2020,1200, 100,"South Korea" ),
                new TV("Samsung", 2021,1000, 80,"South Korea" ),
                new TV("Samsung", 2022,2000, 150,"South Korea" ),
                new TV("Haier", 2020,1200, 100,"China" ),
                new TV("Haier", 2021,1300, 110,"China" ),
                new TV("Haier", 2022,2500, 1500,"China" )
        ));

//■ Показать все телевизоры;
        tvset.stream()
                .forEach(System.out::println);

//■ Показать телевизоры с заданной диагональю;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите диагональ: ");
        double diagonal = scan.nextDouble();
        tvset.stream()
                .filter(n->n.getDiagonal()==diagonal)
                .forEach(System.out::println);

//■ Показать все телевизоры одного производителя;
        System.out.println("Введите производителя: ");
        String manufacturer = scan1.nextLine();
        tvset.stream()
                .filter(n->n.getManufacturer().equals(manufacturer))
                .forEach(System.out::println);

//■ Показать все телевизоры текущего года;
        System.out.println();
        tvset.stream()
                .filter(n->n.getYear()==2022)
                .forEach(System.out::println);

//■ Показать все телевизоры дороже заданной цены;
        System.out.println("Введите цену");
        double price = scan.nextDouble();
        tvset.stream()
                .filter(n->n.getPrice()>price)
                .forEach(System.out::println);

//■ Показать все телевизоры, отсортированные по цене
//по возрастанию;
        System.out.println("Телевизоры по возрастанию цены:");
        tvset.stream()
                .sorted((e1, e2) -> {
                    if (e1.getPrice() < e2.getPrice()) return -1;
                    else
                        if (e1.getPrice() > e2.getPrice()) return 1;
                    return 0;
                })
                .forEach(System.out::println);

//■ Показать все телевизоры, отсортированные по цене
//по убыванию;
        System.out.println("Телевизоры по убыванию цены:");
        tvset.stream()
                .sorted((e1,e2) -> {
                    if (e1.getPrice() > e2.getPrice()) return -1;
                    else
                        if (e1.getPrice() < e2.getPrice()) return 1;
                    return 0;
                })
                .forEach(System.out::println);

//■ Показать все телевизоры, отсортированные по диагонали по возрастанию;
        System.out.println("Телевизоры по возрастанию диагонали:");
        tvset.stream()
                .sorted((e1, e2) -> {
                    if (e1.getDiagonal() < e2.getDiagonal()) return -1;
                    else
                    if (e1.getDiagonal() > e2.getDiagonal()) return 1;
                    return 0;
                })
                .forEach(System.out::println);

//■ Показать все телевизоры, отсортированные по диагонали по убыванию.
        System.out.println("Телевизоры по убыванию диагонали:");
        tvset.stream()
                .sorted((e1,e2) -> {
                    if (e1.getDiagonal() > e2.getDiagonal()) return -1;
                    else
                    if (e1.getDiagonal() < e2.getDiagonal()) return 1;
                    return 0;
                })
                .forEach(System.out::println);

    }
}
