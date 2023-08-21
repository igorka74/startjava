public class CyclesTheme {

    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 20;
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
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = 0;
        int max = 0;
        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
        if (min > num3) {
            min = num3;
        }
        if (max < num3) {
            max = num3;
        }
        for (int i = max - 1; i > min; --i)
        System.out.print(i);

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sum = 0;
        int counter = 4;
        int divider = 1;
        while (counter > 0) {
            sum += ((number / divider) % 10);
            System.out.print((number / divider) % 10);
            counter--;
            divider *= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int startHalfInterval = 1;
        int endHalfInterval = 24;
        int extraZeroes = 5 - ((endHalfInterval - startHalfInterval) % 5);
        for(int i = startHalfInterval; i < endHalfInterval; i++) {
            System.out.printf("%3d",i);
            if (i % 5 == 0) {
                System.out.print("\n");
            }
        }
        while(extraZeroes > 0 && extraZeroes % 5 != 0) {
            System.out.printf("%3d",0);
            extraZeroes--;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int twosCounter = 0;
        int testNumber = 3242592;
        System.out.print("В " + testNumber);
        while (testNumber > 0) {
            int temp = testNumber % 2;
                if (temp == 0 && ((testNumber - 2) % 10 == 0)) {
                    twosCounter++;
                }
            testNumber = testNumber/10;
            }
        if (twosCounter % 2 == 0) {
            System.out.println(" четное количество двоек - " + twosCounter);
        } else {
            System.out.println(" нечетное количество двоек - " + twosCounter);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for(int i = 0; i < 5; i++){ 
            for(int j = 0; j < 10; j++){
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
        int pointNumber =0;
        do{
            System.out.println(sign);
            sign +="$";
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
        for (i = 11; i >9 && i <= 47; i = i + 2)
        System.out.println("  " + i + "          " + (char)i);
        for (i = 98; i < 100; i = i +2)
        System.out.println("  " + i + "          " + (char)i);
        for (i = 100; i < 123; i = i +2)
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
            if (counterNew >3) {
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