package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Input a color: ");
        String color = in.next();
        Shape shape = new Shape(color, new Point[]{new Point(), new Point(), new Point()});
        System.out.println(shape);

        Ball ball = new Ball(40, 4.5f, "football");
        System.out.println(ball);

        System.out.print("Input dog's name: ");
        String name = in.next();
        System.out.print("Input dog's age: ");
        int age = in.nextInt();
        Dog dog = new Dog(name, age);
        System.out.println(dog);
        String dname;
        DogKennel dogkennel = new DogKennel();
        while (true) {
            System.out.print("Input new dog's name: ");
            System.out.println("If u want to stop enter 'break' ");
            dname = in.next();
            if (dname.equals("break")) break;
            dogkennel.setDname(dname);
            dogkennel.addDogs();
            System.out.println(dogkennel);
        }
    }
}
