package task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
//Для набора названий городов (города могут повторяться) нужно:
// ■  Показать все города;
// ■  Показать все города с названием длиннее шесть символов;
// ■  Посчитать сколько раз встречается город, чье название ввёл пользователь;
// ■  Показать все города, которые начинаются на заданную букву;

List <String> city = new ArrayList<>(List.of(new String[]{
        "Crifield", "Zleding", "Ravine", "Lesea", "Zord", "Braka"
}));

//Показать все города;
        System.out.println(city);

//Показать все города с названием длиннее шесть символов;
        city.stream()
                .filter(n->n.length()>6)
                .forEach(n->System.out.println(n));

        Scanner scan = new Scanner(System.in);
//Посчитать сколько раз встречается город, чье название ввёл пользователь;
        System.out.println("Введите название города");
        String name = scan.nextLine();
        long count = city.stream()
                .filter(n-> n.equals(name))
                .count();
        System.out.println(count);

//Показать все города, которые начинаются на заданную букву;
        System.out.println("Введите букву: ");
        String letter=scan.nextLine();
        city.stream()
                .filter(n->n.startsWith(letter))
                .forEach(n->System.out.println(n));
    }
}
