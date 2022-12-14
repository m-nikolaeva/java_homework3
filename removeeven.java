import java.util.Random;
import java.util.ArrayList;

/* Пусть дан произвольный список целых чисел, 
удалить из него четные числа */

public class removeeven {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> rndList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            rndList.add(rnd.nextInt(-20, 20));
        }
        System.out.println(rndList);
        ArrayList<Integer> myArr = removeEvenNumbers(rndList);
        System.out.println(myArr);
    }

    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> array) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int num : array) {
            if (num % 2 != 0) {
                resultArray.add(num);
            }
        }
        return resultArray;
    }
}
