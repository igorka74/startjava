public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");
        byte cpuCoresNumber = 2;
        short ramAmount = 4;
        int cpuFrequency = 1100;
        long osBuildNumber = 19045;
        float smbiosVersion = 3.2f;
        double totalVirtualMemorySize = 8.08;
        char computerBrandFirstLetter = 'd';
        boolean isPowerfulComputer = false;
        System.out.println("Количество ядер процессора: " + cpuCoresNumber);
        System.out.println("Объём оперативной памяти: " + ramAmount + " Gb");
        System.out.println("Частота процессора: " + cpuFrequency + " Hz");
        System.out.println("Номер сборки ОС: " + osBuildNumber);
        System.out.println("Версия SMBIOS: " + smbiosVersion);
        System.out.println("Общий объём виртуальной памяти: " + totalVirtualMemorySize + " Gb");
        System.out.println("Первая буква названия производителя компьютера: " 
            + computerBrandFirstLetter);
        System.out.println("Это мощный компьютер? Ответ: " + isPowerfulComputer + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        double discount = 0.11;
        double discountAmount = totalPrice * discount;
        double discountPrice = totalPrice - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + totalPrice + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " руб.\n");

        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Первоначальное значение типа byte: " + maxByte 
            + " , значение после инкремента на единицу: " + ++maxByte 
            + " , значение после декремента на единицу: " + --maxByte);
        System.out.println("Первоначальное значение типа short: " + maxShort 
            + " , значение после инкремента на единицу: " + ++maxShort 
            + " , значение после декремента на единицу: " + --maxShort);
        System.out.println("Первоначальное значение типа int: " + maxInt 
            + " , значение после инкремента на единицу: " + ++maxInt 
            + " , значение после декремента на единицу: " + --maxInt);
        System.out.println("Первоначальное значение типа long: " + maxLong 
            + " , значение после инкремента на единицу: " + ++maxLong 
            + " , значение после декремента на единицу: " + --maxLong + "\n");

        System.out.println("5. Перестановка значений переменных\n");
        System.out.println("Перестановка значений переменных с помощью третьей переменной:\n");
        int a = 2;
        int b = 5;
        int swap = b;
        b = a;
        a = swap;
        System.out.println(a + " и " + b + "\n");
        System.out.println("Перестановка значений переменных с помощью арифметических операций:\n");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " и " + b + "\n");
        System.out.println("Перестановка значений переменных с помощью побитовой операции:\n");
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println(a + " и " + b + "\n");

        System.out.println("6. Вывод символов и их кодов\n");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа: " + (int) dollar + " Отображение символа: " + dollar);
        System.out.println("Код символа: " + (int) asterisk + " Отображение символа: " + asterisk);
        System.out.println("Код символа: " + (int) atSign + " Отображение символа: " + atSign);
        System.out.println("Код символа: " + (int) verticalBar + " Отображение символа: " 
            + verticalBar);
        System.out.println("Код символа: " + (int) tilde + " Отображение символа: " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        String space = " ";
        char underScore = '_'; 
        char leftParenthesis = '(';
        char rightParenthesis = ')'; 
        char slash = '/'; 
        char backSlash = '\\'; 
        System.out.println(space + space + space + space + slash + backSlash + space + space 
            + space + space);
        System.out.println(space + space + space + slash + space + space + backSlash + space 
            + space + space);
        System.out.println(space + space + slash + underScore + leftParenthesis + space 
            + rightParenthesis + backSlash + space + space);
        System.out.println(space + slash + space + space + space + space + space + space 
            + backSlash + space);
        System.out.println(String.valueOf(slash) + underScore + underScore + underScore + 
            underScore + slash + backSlash + underScore + underScore + backSlash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");
        int num = 123;
        int hundreds = (num / 100) % 10;
        int dozens = (num / 10) % 10;
        int units = num % 10;
        System.out.println(num);
        System.out.println(hundreds);
        System.out.println(dozens);
        System.out.println(units);
        System.out.println(hundreds + dozens + units);
        System.out.println(hundreds * dozens * units + "\n");

        System.out.println("9. Вывод времени\n");
        int time = 86399;
        int hh = time / 3600;
        int mm = time / 60 % 60;
        int ss = time % 60;
        System.out.println(hh + ":"+ mm + ":" + ss);
    }
}