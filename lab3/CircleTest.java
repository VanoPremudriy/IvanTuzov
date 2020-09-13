package ru.mirea.java2020.lab3;

import ru.mirea.java2020.lab4.Author;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius;
        String color;
        Circle newCircle = new Circle();

        System.out.print("Введите радиус окружности: ");
        radius = sc.nextDouble();
        System.out.print("Введите цвет окружности: ");
        color = sc.next();
        newCircle.setRadius(radius);
        newCircle.setColor(color);
        System.out.print(newCircle.toString());

        Author  a = new Author("few", "efwe", 'm');
        System.out.print(a.toString());
    }
}
