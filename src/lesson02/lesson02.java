package lesson02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class lesson02 {

    public static void main(String[] args) {

        System.out.println(myInteger(13,4));
        System.out.println("********************");
        myNumbers();
        System.out.println("********************");
        System.out.println(myNegativeNumber(-8));
        System.out.println("********************");
        myStringMethod("Hello world", 2);
        System.out.println("********************");
        checkLeapYear(2020);
        checkLeapYear2(2021);



    }
    /*
   1. Написать метод, принимающий на вход два целых числа и проверяющий, что их
   сумма лежит в пределах от 10 до 20 (включительно), если да - вернуть true,
   в противном случае - false.
     */
    public static boolean myInteger(int a, int b) {

        int result = a + b;

            if (result >= 10 && result <= 20) {
                return true;
            } else {
                return false;
            }
        }
    /*
    2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или
    отричательное. Замечание: ноль считаем положительным числом.
     */
    public static void myNumbers() {
        int a = -15;

            if (a >= 0) {
                System.out.println("It's positive number");
            } else {
                System.out.println("It's negative number");
            }
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true если число отрицательное, и вернуть false если
    число положительное.
     */
    public static boolean myNegativeNumber(int a) {

        if(a >= 0) {
            return true;
        }
            return false;
    }

    /*
    4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз.
     */

    public static void myStringMethod(String phrase, int times) {

        for( int i = 0; i < times; i++) {
            System.out.println(phrase);
        }
    }

    /*
    5.
    Написать метод, который определяет, является ли год високосным, и возвращает boolean
    (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме
    каждого 100-го, при этом каждый 400-й - високосный.
     */

    public static void checkLeapYear(int i) {

        if((i % 4 == 0) || (i % 100 == 0) || (i % 400 == 0)) {
            System.out.println(i + " it's a leap year");
        } else {
            System.out.println(i + " it's not a leap year");
        }
    }

    //2 вариант решения
    public static boolean checkLeapYear2(int i) {
        if((i % 4 == 0) || (i % 100 == 0) || (i % 400 == 0)) {
            return true;
        }
            return false;
    }

    }
