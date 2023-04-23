//Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task3_02{
    public static void main(String[] args) {
        int counter, num, array[];
        Scanner inp = new Scanner(System.in);
        System.out.println("введите количество элементов массива:  ");
        num = inp.nextInt();
        array = new int[num];
        System.out.println("введите "+ num +" чисел");
        for(counter = 0; counter<num;counter++){
            array[counter] = inp.nextInt();
        }
        System.out.println("Ваш массив: "+ Arrays.toString(array));

        List<Integer> nextArray = new ArrayList<>();
        for( int i = 0; i < num; i++){
            if (array[i] % 2 != 0){
                nextArray.add(array[i]);
            }
        }
        System.out.println (Arrays.toString(nextArray.stream().mapToInt(Integer::intValue).toArray()));
    }
}
