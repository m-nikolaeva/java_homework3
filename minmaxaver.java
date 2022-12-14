import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее из этого списка. */

public class minmaxaver {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            myList.add(rnd.nextInt(-20, 20));
        }
        int sumItems = 0;
        for (int item : myList) {
            sumItems += item;
        }
        float average = (float) sumItems / myList.size();
        System.out.println(myList);
        if (myList.size() % 2 != 0) {
            System.out.println("В середине списка находится число: " + myList.get(myList.size() / 2));
        } else {
            System.out.println("В середине списка находятся числа: " + myList.get(myList.size() / 2 - 1) + " " +
                    "и" + " " + myList.get(myList.size() / 2));
        }
        System.out.printf("Среднее арифметическое = %.2f\n", average);
        System.out.printf("Максимальное значение  = %d\n", Collections.max(myList));
        System.out.printf("Минимальное значение  = %d\n", Collections.min(myList));
    }
}
