public class Main {

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
    }

    public static void task_1() {
        System.out.println("Задача 1");

        int age = 81;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенно летний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершенно летия, нужно немного подождать.");
        }
    }

    public static void task_2() {
        System.out.println("Задача 2");
        int temp = 18;
        if (temp >= 5) {
            System.out.println("Сегодня тепло, " + temp + " можно идти без шапки");
        } else {
            System.out.println("На улице холодно, " + temp + " нужно надеть шапку");
        }

    }

    public static void task_3() {
        System.out.println("Задача 3");
        int speed = 48;
        if (speed <= 60) {
            System.out.println("Скорость, " + speed + " можно ехать спокойно");
        } else {
            System.out.println("Скорость, " + speed + " придется заплатить штраф");
        }
    }

    public static void task_4() {
        System.out.println("Задача 4");
        int age = 33;
        if (age <= 2) {
            System.out.println("Если возраст человека равен " + age + " то ему пора спать");
        } else if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age > 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else if (age > 24 && age <= 65) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        } else if (age > 65) {
            System.out.println("Если возраст человека больше " + age + " то ему можноидти на пенсию");
        }
    }

    public static void task_5() {
        System.out.println("Задача 5");
        int age = 13;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task_6() {
        System.out.println("Задача 6");
        int tiket = 54;
        if (tiket <= 60) {
            System.out.println("Билет " + tiket + ", места есть, в том числе сидячие");
        } else if (tiket > 60 && tiket <= 102) {
            System.out.println("Билет " + tiket + ", остались только стоячие места");
        } else if (tiket > 102) {
            System.out.println("Билет " + tiket + ", мест нет");
        }
    }

    public static void task_7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        } else if (one < two && two > three) {
            System.out.println("Число " + two + " самое большое");
        } else if (three > two && one < three) {
            System.out.println("Число " + three + " самое большое");
        }

    }

}