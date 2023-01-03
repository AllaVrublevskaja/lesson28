package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
//        Для набора случайно сгенерированных целых чисел нужно:
//        ■  Количество четных;
//        ■  Количество нечетных;
//        ■  Количество равных 0;
//        ■  Количество равных значению, введенному пользователем.
        ArrayList<Integer> randomIntegers = new ArrayList<>();
        Random ran = new Random();
        List<Integer> list  = Stream.generate(()->ran.nextInt(100))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);

//Количество четных;
        long numb1 = list.stream()
                .filter(n->n%2 == 0)
                .count();
        System.out.println(numb1);

//Количество нечетных;
        long numb2 = list.stream()
                .filter(n->n%2 != 0)
                .count();
        System.out.println(numb2);

//Количество равных 0;
        long numb0 = list.stream()
                .filter(n->n==0)
                .count();
        System.out.println(numb0);

        Scanner scan = new Scanner(System.in);
// Количество равных значению, введенному пользователем.
        System.out.println("Введите число");
        int num =scan.nextInt();
        long number = list.stream()
                .filter(n->n==num)
                .count();
        System.out.println(number);

    }
}
