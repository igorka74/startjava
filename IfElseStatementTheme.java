public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        if (!isMale) {
            System.out.println("Пол - женский");
        } else {
            System.out.println("Пол - мужской\n");
        }
        int age = 22;
        if (age > 18) {
            System.out.println("Можно водить машину");
        } else {
            System.out.println("Нельзя водить машину\n");
        }
        double height = 1.6;
        if (height < 1.8) {
            System.out.println("Рост не подходит для баскетбола");
        } else {
            System.out.println("Рост подходит для баскетбола");
        }
        char firstNameLetter = "Михаил".charAt(0);
        if (firstNameLetter == 'М') {
            System.out.println("Возможно, вас зовут Михаил\n");
        } else {
            System.out.println("Вас точно зовут не Михаил\n");
        }

        System.out.println("2. Поиск большего числа");
        int a = 11;
        int b = 15;
        if (a > b) {
            System.out.println("a больше b\n");
        } else if (a == b) {
            System.out.println("a равно b\n");
        } else { 
            {
                System.out.println("a меньше b\n");
            }
        }

        System.out.println("3. Проверка числа");
        int num = -11;
        boolean isZero = (num == 0);
        boolean isPositive = (num > 0);
        boolean isEven = (num % 2 == 0);
        if (isZero) {
            System.out.println("Число равно нолю\n");
        } else if(isPositive) {
            if(isEven) {
                System.out.println("Число " + num 
                        + " является положительным и четным\n");
            } else {
                System.out.println("Число " + num + " является положительным и нечетным\n");
            }
        } else {
            if(isEven) {
                System.out.println("Число " + num + " является отрицательным и четным\n");
            } else {
                System.out.println("Число " + num + " является отрицательным и нечетным\n");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;
        int ones = num1 % 10;
        int tens = (num1 / 10) % 10;
        int hundreds = (num2 / 100) % 10;
        boolean sameDigitInOnes = (num1 % 10) == (num2 % 10);
        boolean sameDigitInTens = ((num1 / 10) % 10) == ((num2 / 10) % 10);
        boolean sameDigitInHundreds = ((num1 / 100) % 10) == ((num2 / 100) % 10);
        if (!sameDigitInHundreds && !sameDigitInTens && !sameDigitInOnes) {
            System.out.println("Одинаковых цифр ни в одном разряде нет");
        } else if (sameDigitInOnes && sameDigitInTens && sameDigitInHundreds) {
            System.out.println("Числа " + num1 + " и " + num2 + " содержат одинаковую цифру " 
                    + ones + " в 1 разряде" + " , одинаковую цифру " 
                    + tens + " во 2 разряде" + " , одинаковую цифру " 
                    + hundreds + " в 3 разряде");
        } else if (sameDigitInOnes && sameDigitInTens) {
            System.out.println("Числа " + num1 + " и " + num2 + " содержат одинаковую цифру " 
                    + ones + " в 1 разряде и одинаковую цифру " 
                    + tens + " во 2 разряде ");
        } else if (sameDigitInOnes && sameDigitInHundreds) {
            System.out.println("Числа " + num1 + " и " + num2 + " содержат одинаковую цифру " 
                    + ones + " в 1 разряде и одинаковую цифру " 
                    + hundreds + " в 3 разряде");
        } else if (sameDigitInTens && sameDigitInHundreds) {
            System.out.println("Числа " + num1 + " и " + num2 + " содержат одинаковую цифру " 
                    + tens + " во 2 разряде  и одинаковую цифру " 
                    + hundreds + " в 3 разряде");
        } else if (sameDigitInOnes) {
            System.out.println("Числа " + num1 + " и " + num2 + " содержат одинаковую цифру " 
                    + ones + " в 1 разряде");
        } else if (sameDigitInTens) {
            System.out.println("Числа " + num1 + " и " + num2 + " содержат одинаковую цифру " 
                    + tens + " во 2 разряде");
        } else if (sameDigitInHundreds) {
            System.out.println("Числа " + num1 + " и " + num2 + " содержат одинаковую цифру " 
                    + hundreds + " в 3 разряде");
        }

        System.out.println("\n5. Определение символа по его коду");
        char testChar = '\u0057';
        char sign = (char) testChar;
        if ((int) testChar >= 0 && (int) testChar < 48) {
            System.out.println("Символ " + testChar + " не является буквой или цифрой");
        } else if ((int) testChar >= 48 && (int) testChar < 58) {
            System.out.println("Символ " + testChar + " является цифрой");
        } else if ((int) testChar >= 58 && (int) testChar < 65) {
            System.out.println("Символ " + testChar + " не является буквой или цифрой");
        } else if ((int) testChar >= 65 && (int) testChar < 91) {
            System.out.println("Символ " + testChar + " является большой буквой");
        } else if ((int) testChar >= 91 && (int) testChar < 97) {
            System.out.println("Символ " + testChar + " не является буквой или цифрой");
        } else if ((int) testChar >= 97 && (int) testChar < 123) {
            System.out.println("Символ " + testChar + " является маленькой буквой");
        } else if ((int) testChar >= 123 && (int) testChar <= 127) {
            System.out.println("Символ " + testChar + " не является буквой или цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 301000.00;
        double profit;
        double lowProfit = 0.05;
        double mediumProfit = 0.07;
        double highProfit = 0.1;
        if (deposit < 100000.00) {
            profit = deposit * lowProfit;
            System.out.println("Сумма вклада: " + deposit + 
                    " руб.\nНачисленные проценты: " + profit + 
                    " руб.\nОбщая сумма с процентами:" + (deposit + profit) + " руб.");
        } else if (deposit >= 100000.00 && deposit <= 300000.00) {
            profit = deposit * mediumProfit;
            System.out.println("Сумма вклада: " + deposit + 
                    " руб.\nНачисленные проценты: " + profit + 
                    " руб.\nОбщая сумма с процентами:" + (deposit + profit) + " руб.");
        } else if (deposit > 300000.00) {
            profit = deposit * highProfit;
            System.out.println("Сумма вклада: " + deposit + 
                    " руб.\nНачисленные проценты: " + profit + 
                    " руб.\nОбщая сумма с процентами:" + (deposit + profit) + " руб.");
        }

        System.out.println("\n7. Определение оценки по предметам");
        int historyScore = 0;
        int codingScore = 0;
        int historyPoints = 59;
        int codingPoints = 92;
        if (historyPoints <= 60) {
            historyScore = 2;
        } else if (historyPoints > 60 && historyPoints < 73) {
            historyScore = 3;
        } else if (historyPoints >= 73 && historyPoints <= 91) {
            historyScore = 4;
        } else if (historyPoints > 91) {
            historyScore = 5;
        }
        if (codingPoints <= 60) {
            codingScore = 2;
        } else if (codingPoints > 60 && codingPoints < 73) {
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