package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        within10and20(10, 20);
        System.out.println(within10or20(6, 5));
        System.out.println();
        isPositiveOrNegative(-9);
        System.out.println();
        System.out.println(isNegative(10));
        System.out.println();
        printsString ("Хорошая погода", 5);

    }
    /*1 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static void within10and20(int x1, int x2) {

        if ((x1 + x2) >= 10 && (x1 + x2) <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


    //ИЛИ


    public static boolean within10or20(int x1, int x2) {
        if ((x1 + x2) >= 10 && (x1 + x2) <= 20)
            return true;
        else
            return false;

    }


    /* 2 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */


    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("x - положительное число");
        } else {
            System.out.println("x - отрицательное число");
        }
    }

    /* Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
     */

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }



    /*Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
    в консоль указанную строку, указанное количество раз;
     */

    public static void printsString (String str, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }





    }
}
