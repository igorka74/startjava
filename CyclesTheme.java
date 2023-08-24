public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("В отрезке [" + start + ", " + end + "] ");
        do {
            if (start % 2 == 0) {
                sumEven += start;
            } else {
                sumOdd += start;
            }
            start++;
        } while (start <= end);
        System.out.println("сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int min = 5;
        int mid = 10;
        int max = -1;
        int k = 0;
        if (max > mid) {
            k = max;
        } else {
            k = mid;
        }
        if (min > max && min > mid) {
            k = min;
        } 
        if (min < mid) {
            min = min;
        } else {
            min = mid;
        }
        if (max < min) {
            min = max;
        } else {
            min = min;
        }
        for (k = k - 1; k > min; --k)
        System.out.print(k + " ");

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int reverseNumber = 0; 
        int sum = 0; 
        while (number != 0) {
            sum += number % 10;
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10; 
        }
        System.out.println(reverseNumber);
        System.out.println(sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int leftPoint = 1;
        int rightPoint = 24;
        int extraZeroes = (rightPoint - leftPoint) % 5;
        int counter = 0;
        for(int i = leftPoint; i < rightPoint; i = i + 2) {
            ++counter;
            System.out.printf("%3d",i);
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        while(extraZeroes > 0 && counter % 5 != 0) {
            System.out.printf("%3d",0);
            extraZeroes--;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int countTwos = 0;
        int testNumber = 3242592;
        System.out.print("В " + testNumber);
        while (testNumber > 0) {
            int temp = testNumber % 10;
            if (temp == 2) {
                countTwos++;
            }
            testNumber /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println(" четное количество двоек - " + countTwos);
        } else {
            System.out.println(" нечетное количество двоек - " + countTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for(int i = 0; i < 5; i++) { 
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("\n");
        int rowCount = 5;
        int pointCount = 1;
        while (rowCount >= 1) {
            while (pointCount <= rowCount) { 
                System.out.print('#');
                pointCount++;
            } 
            System.out.println("");
            pointCount = 1;
            rowCount--;
        }

        System.out.print("\n");
        String sign = "$";
        int pointNumber = 0;
        do{
            System.out.println(sign);
            sign += "$";
            pointNumber++;
        } while ( pointNumber < 3);
        do{
            pointNumber--;
            System.out.print('$');
            if (pointNumber == 1) {
            System.out.println();
            }
        } while (pointNumber > 0);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL" + "   " + "CHARACTER");
        int i = 0;
        for (i = 1; i <= 9; i = i + 2)
        System.out.println("   " + i + "          " + (char)i);
        for (i = 11; i > 9 && i <= 47; i = i + 2)
        System.out.println("  " + i + "          " + (char)i);
        for (i = 98; i < 100; i = i + 2)
        System.out.println("  " + i + "          " + (char)i);
        for (i = 100; i < 123; i = i + 2)
        System.out.println("  " + i + "         " + (char)i);

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int testNum = 1234321;
        int remainder = 0;
        int reverseNum = 0;
        for (int n = testNum; n > 0; n = n / 10) {
            remainder = n % 10;
            reverseNum = (reverseNum * 10) + remainder;
        }
        if (testNum == reverseNum) {   
            System.out.println("Число " + testNum + " является палиндромом");
        } else {
            System.out.println("Число " + testNum + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int testHappyNum = 123884;
        int sum1 = 0;
        int sum2 = 0;
        int counterNew = 6;
        int dividerNew = 1;
        while (counterNew > 0) {
            if (counterNew > 3) {
                sum1 += ((testHappyNum / dividerNew) % 10);
            } else {
                sum2 += ((testHappyNum / dividerNew) % 10);
            }
            counterNew--;
            dividerNew *= 10;
        }
        if (sum1 == sum2) {
            System.out.println("Число " + testHappyNum + " является счастливым.");
        } else {
            System.out.println("Число " + testHappyNum + " не является счастливым.");
        }
        String str = "" + testHappyNum;
        System.out.println("Сумма цифр " + str.charAt(0) + str.charAt(1) + str.charAt(2) 
                    + " = " + sum2
                    + " , а сумма " + str.charAt(3) + str.charAt(4) + str.charAt(5)
                    + " = " + sum1);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        int s = 0;
        int t = 0;
        System.out.printf("   |");
        for(s = 2;  s < 10; s++)
            System.out.printf("%2d ", s);
            System.out.printf("\n---|-------");
            System.out.printf("----------------\n");
        for(s = 2; s < 10; s++) {
            System.out.printf("%2d |", s);
        for(t = 2; t < 10; t++)
            System.out.printf("%2d ", s * t);
            System.out.printf("\n");
        }
    }
}