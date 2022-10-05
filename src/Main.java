public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int contribution = 15000;
        int sum = 0;
        int i = 0;
        while (sum <= 2_459_000) {
            i++;
            sum += contribution;
            sum = sum + sum / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + "");
        }

        // Задание 2
        System.out.println("Задание 2");
        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int m = 10; m >= 1; m--) {
            System.out.print(m + " ");
        }

        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int populationPlus = (birthRate * 1000) - (mortality * 1000);
        int y = 0;
        while (y < 10) {
            y++;
            population = population + populationPlus;
            System.out.println("Год " + y + ", численность населения составляет " + population + " ");
        }

        // Задание 1. ДЗ2
        System.out.println("Задание 1. ДЗ2");
        int salary = 15000;
        double bank = 0;
        int m = 0;
        while (bank <= 12_000_000) {
            m++;
            bank = bank + salary;
            bank = bank + bank * 0.07;
            System.out.println("Месяц " + m + ", сумма накоплений " + Math.round(bank) + "");
        }
        // Задание 2. ДЗ2
        System.out.println("Задание 2. ДЗ2");
        int salaryN = 15000;
        double bank1 = 0;
        int month = 0;
        while (bank1 <= 12_000_000) {
            month++;
            bank1 = bank1 + salaryN;
            bank1 = bank1 + bank1 * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + Math.round(bank1) + "");
            }
        }
        // Задание 3. ДЗ2
        System.out.println("Задание 3. ДЗ2");
        int salaryK = 15000;
        double bank2 = 0;
        int months = 0;
        while (months < 108) {
            months++;
            bank2 = bank2 + salaryK;
            bank2 = bank2 + bank2 * 0.07;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений " + Math.round(bank2) + "");
            }
        }

        // Задание 4. ДЗ2
        System.out.println("Задание 4. ДЗ2");
        int friday = 7;
        for (friday=7; friday<=31; friday+=7){
            System.out.println("Сегодня пятница, "+ friday +"-е число. Необходимо подготовить отчет");
        }

        // Задание 1. ДЗ3.
        System.out.println("Задание 1. ДЗ3");
        int yearStart = 1817;
        int yearFinal = 2054;
        while (yearFinal>yearStart){
            yearStart+=79;
            System.out.println("Год "+yearStart);
        }

        // Задание 2. ДЗ3.
        System.out.println("Задание 2. ДЗ3");
        for (int number=1; number<=10; number++){
            System.out.println("2*"+ number + "=" + (2*number));
        }
    }
    }

