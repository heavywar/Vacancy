package Strategy;

import java.util.Arrays;

public class ArrayBubble<T extends Comparable<T>> implements Sorting<T> {
    @Override
    public void sort(T[] arr) {
        System.out.println("Сортировка пузырьком");
        for(int i =arr.length-1; i>=0; i--){
            for (int j = 0; j <i ; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    T a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;

                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
