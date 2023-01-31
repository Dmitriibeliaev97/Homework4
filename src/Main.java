import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = -2;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

    }


    public static void task3() {
        System.out.println("Задача 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");

        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 14;
        boolean goToKindergarten = age >= 2 && age < 6;
        boolean goToSchool = age >= 7 && age < 18;
        boolean goToUniversity = age > 18 && age < 24;
        boolean goToWork = age > 24;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (goToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (goToWork) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

    }
    public static void task5() {
        System.out.println("Задача 5");
    }
    public static void task6() {
        System.out.println("Задача 6");
    }
    public static void task7() {
        System.out.println("Задача 7");
    }
}