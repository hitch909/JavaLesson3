import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3_03 {
    public static void main(String[] args) {
        List<Integer> mass = new ArrayList<>(Arrays.asList(12, 23, 56, 25, 32, 64, 21, 66));

        int min, max, longMass;
        System.out.println(Arrays.toString(mass.stream().mapToInt(Integer::intValue).toArray()));

        max = Collections.max(mass);
        System.out.println("Maximum is : " + max);

        min = Collections.min(mass);
        System.out.println("Minimum is : " + min);

        int summ = 0;
        longMass = mass.size();
        for (int value : mass) {
            summ += value;
        }
        System.out.println("Long is : " + longMass);
        double average = summ / longMass;
        System.out.println("Average is : " + average);
    }
}
