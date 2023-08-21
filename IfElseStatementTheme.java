public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        if (!isMale) {
            System.out.println("Пол - женский");
        } else {
            System.out.println("Пол - мужской");
        }
        int age = 22;
        if (age > 18) {
            System.out.println("Можно водить машину");
        } else {
            System.out.println("Нельзя водить машину");
        }
        double height = 1.6;
        if (height < 1.8) {
            System.out.println("Рост не подходит для баскетбола");
        } else {
            System.out.println("Рост подходит для баскетбола");
        }
        char firstNameLetter = "Михаил".charAt(0);
        if (firstNameLetter == 'М') {
            System.out.println("Возможно, вас зовут Михаил");
        } else {
            System.out.println("Вас точно зовут не Михаил");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 11;
        int b = 15;
        if (a > b) {
            System.out.println("a больше b");
        } else if (a < b) {
            System.out.println("a меньше b");
        } else { 
            System.out.println("a равно b");
        }

        System.out.println("\n3. Проверка числа");
        int num = -10;
        System.out.print("Число " + num + " является ");
        if (num == 0) {
            System.out.println(num);
        } else {
            if (num > 0) {
                System.out.print("положительным");
            } else {
                System.out.print("отрицательным");
        }
        if (num % 2 != 0) {
            System.out.print(" и нечетным");
        } else {
            System.out.print(" и четным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        int num1 = 423;
        int num2 = 421;
        int ones = num1 % 10;
        int tens = (num1 / 10) % 10;
        int hundreds = (num1 / 100) % 10;
        boolean isEqualOnes = (num1 % 10) == (num2 % 10);
        boolean isEqualTens = ((num1 / 10) % 10) == ((num2 / 10) % 10);
        boolean isEqualHundreds = ((num1 / 100) % 10) == ((num2 / 100) % 10);
        if (!isEqualHundreds && !isEqualTens && !isEqualOnes) {
            System.out.println("Одинаковых цифр ни в одном разряде нет");
        } else {
            if (isEqualOnes) {
                System.out.println("Числа " + num1 + " и " + num2 +
                        " содержат одинаковую цифру " + ones + " в 1 разряде");
            }
            if (isEqualTens) {
                System.out.println("Числа " + num1 + " и " + num2 + 
                        " содержат одинаковую цифру " + tens + " во 2 разряде ");
            }
            if (isEqualHundreds) {
                System.out.println("Числа " + num1 + " и " + num2 +
                        " содержат одинаковую цифру " + hundreds + " в 3 разряде");
            }
        } 

        System.out.println("\n5. Определение символа по его коду");
        char testChar = '\u0057';
        System.out.print("Символ " + testChar + " является ");
        if (testChar >= '0' && testChar <= '9' ) {
            System.out.println("цифрой");
        } else if (testChar >= 'A' && testChar <= 'Z') {
            System.out.println("большой буквой");
        } else if (testChar >= 'a' && testChar <= 'z') {
            System.out.println("маленькой буквой");
        } else {
            System.out.println("не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 301000.00;
        double profit = 0.5;
        if (deposit >= 100000.00 && deposit <= 300000.00) {
            profit = 0.7;
        } else if (deposit > 300000.00) {
            profit = 0.1;
        }
        System.out.println("Сумма вклада: " + deposit + 
                " руб.\nНачисленные проценты: " + deposit * profit + 
                " руб.\nОбщая сумма с процентами: " + (deposit + (deposit * profit)) + " руб.");

        System.out.println("\n7. Определение оценки по предметам");
        int historyScore = 2;
        int historyPoints = 59;
        if (historyPoints > 60 && historyPoints < 73) { 
            historyScore = 3;
        } else if (historyPoints >= 73 && historyPoints <= 91) {
            historyScore = 4;
        } else if (historyPoints > 91) {
            historyScore = 5;
        }
        int codingScore = 2;
        int codingPoints = 92;
        if (codingPoints > 60 && codingPoints < 73) {
            codingScore = 3;
        } else if (codingPoints >= 73 && codingPoints <= 91) {
            codingScore = 4;
        } else if (codingPoints > 91) {
            codingScore = 5;
        }
        System.out.println("Оценка по истории: " + historyScore 
                + "\nОценка по программированию: " + codingScore 
                + "\nСредний балл по предметам: " + (double) (historyScore + codingScore) / 2
                + "\nСредний % выполнения заданий: " + (historyPoints + codingPoints) / 2);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlySales = 13000;
        int monthlyRental = 5000;
        int monthlyExpenses = 9000;
        int yearlyProfit = (monthlySales - monthlyRental - monthlyExpenses) * 12;
        if (yearlyProfit <= 0) {
            System.out.println("Прибыль за год: " + yearlyProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: +" + yearlyProfit + " руб.");
        }
    }
}