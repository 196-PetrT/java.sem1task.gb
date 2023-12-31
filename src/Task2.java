//Напишите функцию printPrimeNums, которая выведет на экран все простые
//числа в промежутке от 1 до 1000, каждое на новой строке.
//Напишите свой код в методе printPrimeNums класса Answer.

class Answer2 {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        int n = 1000;
        int count = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) System.out.println(i);
            count = 0;
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {

        Answer2 ans = new Answer2();
        ans.printPrimeNums();
    }
}

//////////////
//class Answer {
//    public static void printPrimeNums() {
//        // Напишите свое решение ниже
//
//        // Проход начинается с 2, т.к. это число является наименьшим простым
//        for (int i = 2; i <= 1000; i++) {
//
//            boolean isPrime = true;
//
//            // Проверка, является ли число i простым
//            // Проход по циклу до корня числа,
//            // т.к. дальше нет смысла искать, делителей нет.
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            // Если число i простое, вывод его на экран
//            if (isPrime)
//                System.out.println(i);
//        }
//    }
//}
//
//public class Printer{
//    public static void main(String[] args) {
//
//        Answer ans = new Answer();
//        ans.printPrimeNums();
//    }
//}
