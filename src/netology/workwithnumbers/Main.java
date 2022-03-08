package netology.workwithnumbers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	// write your code here
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedList = new ArrayList<>();

        for (Integer numbers : intList) {
            if (numbers > 0 && numbers % 2 == 0) {
                sortedList.add(numbers);
            }
        }

        Collections.sort(sortedList);
        for (Integer n : sortedList) {
            System.out.println(n);
        }
    }
}
