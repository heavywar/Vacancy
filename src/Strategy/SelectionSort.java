package Strategy;

import java.util.Arrays;

public class SelectionSort<T extends Comparable<T>> implements Sorting<T> {
    @Override
    public void sort(T[] numbers) {
        int min;
          T temp;

        for (int index = 0; index < numbers.length-1; index++){
            min = index;
            for (int scan = index+1; scan < numbers.length; scan++){
                if (numbers[scan].compareTo( numbers[min])<0)
                    min = scan;
            }

            // Swap the values
            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
