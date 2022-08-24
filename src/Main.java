import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int ClientOS = 0;
        if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2025;
        int clientOS = 0;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычное приложение для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите обычное приложение для IOS по ссылке");
            }
        }


        int years = 2022;
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    int monthNumber = 12;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
        System.out.println("Зима");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println("Весна");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println("Лето");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println("Осень");
        break;
        default:
            System.out.println("Месяц " + monthNumber + " не существует");
    }
}




