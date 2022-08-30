import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isYearLeap(2020);
        downloadText(1, 2020);
        System.out.println("Потребуется дней: " + deliveryRangeDistance(1012));

    }

    // Задание 1 \\
    public static int isYearLeap(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год ");
        } else {
            System.out.println(year + " - не високосный год ");
        }
        return year;
    }

    // Задание 2 \\
    public static void downloadText(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear <= currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear > currentYear && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > currentYear && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    // Задание 3 \\
    public static int deliveryRangeDistance(int deliveryDistance) {
        int deliveryDays = 1;
        int differenceDays = 40;
        int startLimit = 20;
        if (deliveryDistance <= 20) {
        } else if (deliveryDistance > 20 && deliveryDistance <= 59) {
            deliveryDays = deliveryDays + 1;
        } else if (deliveryDistance > 59) {
            deliveryDays = (deliveryDistance + startLimit) / differenceDays + 1;
        }
        return deliveryDays;
    }
}