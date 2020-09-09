import Tasks.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        boolean flag = true;
        BufferedReader reader;
        while (flag) {
            System.out.println("Выберите номер раздела");
            System.out.println("1. Линейные программы");
            System.out.println("2. Ветвления");
            System.out.println("3. Циклы");
            System.out.println("0. Завершение программы");
            while (true) {
                reader = new BufferedReader(new InputStreamReader(System.in));
                n = Integer.parseInt(reader.readLine());
                if (n < 0 || n > 3) {
                    System.out.println("Введите число от 0 до 3");
                } else break;
            }
            switch (n) {
                case 1 -> {
                    while (flag) {
                        System.out.println("Линейные программы");
                        System.out.println("Выберите номер задания");
                        System.out.println("1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.");
                        System.out.println("2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): (b+sqrt(b^2+4*a*c))/2*a - a^3*c + b^(-2)");
                        System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): ((sin(x)+cos(y))/(cos(x)-sin(y)))*tg(x*y)");
                        System.out.println("4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.");
                        System.out.println("5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.");
                        System.out.println("6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит области (-4<=x<=4) и (-3<=y<=4), и false — в противном случае");
                        System.out.println("0. Возврат в предыдущее меню.");
                        n = Integer.parseInt(reader.readLine());
                        switch (n) {
                            case 1 -> {
                                System.out.println("Введите числа a, b, c");
                                System.out.println("Z= " + Task11.func(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
                                System.out.println();
                            }
                            case 2 -> {
                                System.out.println("Введите числа a, b, c");
                                System.out.println("Z= " + Task12.func(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
                                System.out.println();
                            }
                            case 3 -> {
                                System.out.println("Введите числа x, y");
                                System.out.println("Z= " + Task13.func(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
                                System.out.println();
                            }
                            case 4 -> {
                                System.out.println("Введите число x");
                                System.out.println("Z= " + Task14.revers(Double.parseDouble(reader.readLine())));
                                System.out.println();
                            }
                            case 5 -> {
                                System.out.println("Введите число x");
                                Task15.time(Integer.parseInt(reader.readLine()));
                                System.out.println();
                            }
                            case 6 -> {
                                System.out.println("Введите число x и y");
                                System.out.println(Task16.func(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
                                System.out.println();
                            }
                            case 0 -> flag = false;
                        }
                    }
                    flag = true;
                }
                case 2 -> {
                    while (flag) {
                        System.out.println("Ветвление");
                        System.out.println("Выберите номер задания");
                        System.out.println("1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.");
                        System.out.println("2. Найти max{min(a, b), min(c, d)}.");
                        System.out.println("3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.");
                        System.out.println("4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.");
                        System.out.println("5. Вычислить значение функции: F(x)=(x^2-3*x+9, если x<=3 и 1/(x^3+6), если x>3)");
                        System.out.println("0. Возврат в предыдущее меню.");
                        n = Integer.parseInt(reader.readLine());
                        switch (n) {
                            case 1 -> {
                                System.out.println("Введите числа значения двух углов");
                                Task21.func(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                                System.out.println();
                            }
                            case 2 -> {
                                System.out.println("Введите числа a, b, c, d");
                                System.out.println("Max= " + Task22.max(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
                                System.out.println();
                            }
                            case 3 -> {
                                System.out.println("Введите 3 координаты x, y");
                                Task23.point(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()),
                                        Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()),
                                        Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                                System.out.println();
                            }
                            case 4 -> {
                                System.out.println("Введите 5 значений, первые 2 стороны A и B отверстия, остальные размеры кирпича x, y, z");
                                Task24.meth(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()),
                                        Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()),
                                        Integer.parseInt(reader.readLine()));
                                System.out.println();
                            }
                            case 5 -> {
                                System.out.println("Введите число x");
                                System.out.println("F(x) = " + Task25.func(Integer.parseInt(reader.readLine())));
                                System.out.println();
                            }
                            case 0 -> flag = false;
                        }
                    }
                    flag = true;
                }
                case 3 -> {
                    while (flag) {
                        System.out.println("Циклы");
                        System.out.println("Выберите номер задания");
                        System.out.println("1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.");
                        System.out.println("2. Вычислить значения функции на отрезке [а,b] c шагом h: y = (x, x > 2) или y=(-x, x <= 2).");
                        System.out.println("3. Найти сумму квадратов первых ста чисел.");
                        System.out.println("4. Составить программу нахождения произведения квадратов первых двухсот чисел.");
                        System.out.println("5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид: an=(1/2^n)+(1/3^n).");
                        System.out.println("6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
                        System.out.println("7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.");
                        System.out.println("8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
                        System.out.println("0. Возврат в предыдущее меню.");
                        n = Integer.parseInt(reader.readLine());
                        switch (n) {
                            case 1 -> {
                                System.out.println("Введите любое целое положительное число.");
                                System.out.println("Сумма равна " + Task31.sum(Integer.parseInt(reader.readLine())));
                                System.out.println();
                            }
                            case 2 -> {
                                System.out.println("Введите числа a, b и шаг h");
                                Task32.func(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                                System.out.println();
                            }
                            case 3 -> {
                                System.out.println(Task33.sum());
                                System.out.println();
                            }
                            case 4 -> {
                                System.out.println(Task34.multiply());
                                System.out.println();
                            }
                            case 5 -> {
                                System.out.println("Введите число e");
                                System.out.println("Sum = " + Task35.sum(Double.parseDouble(reader.readLine())));
                                System.out.println();
                            }
                            case 6 -> {
                                Task36.ch();
                                System.out.println();
                            }
                            case 7 -> {
                                System.out.println("Введите число m и n");
                                Task37.divider(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                                System.out.println();
                            }
                            case 8 -> {
                                System.out.println("Введите два числа");
                                Task38.func(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                                System.out.println();
                            }
                            case 0 -> flag = false;
                        }
                    }
                    flag = true;
                }
                case 0 -> {
                    System.out.println("Завершение программы");
                    flag = false;
                    reader.close();
                }
            }
        }
    }
}
