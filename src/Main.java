import java.time.Year;

public class Main {
    public static void leapYear(int year) {

        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }
    }

    public static void clientDevice(int clientOS, int clientDeviceYear) {
        String operationSystem;
        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + operationSystem + " по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке");
        }
    }

    public static void delivery(int deliveryDistance, int days) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + days + " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется " + (days + 1) + "дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется " + (days + 2) + " дня");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача №1");

        int year = 2021;
        leapYear(year);

        System.out.println("Задача №2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        clientDevice(clientOS, clientDeviceYear);

        System.out.println("Задача №3");
        int deliveryDistance = 95;
        int days = 1;
        delivery(deliveryDistance,days);

    }
}







