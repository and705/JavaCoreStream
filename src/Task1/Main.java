package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(3);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);


        //Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        //intList.remove(intList.get(4));

        //Отфильтруйте положительные числа
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) <= 0) {
                intList.remove(i);
                i--;
            }
        }
        //Найдите среди этих положительных чисел четные.
        for (int i = 0; i < intList.size(); i++) {
            if ((intList.get(i) % 2 != 0)) {
                intList.remove(i);
                i--;
            }
        }
// Отсортируйте отфильтрованные числа в порядке возрастания.
        Collections.sort(intList);
        //Выведите результат на экран.
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
