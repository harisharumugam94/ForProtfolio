package String_array;

import java.util.Arrays;

public class Array_operation {
    public static void main(String[] args){
        int[] arr={12,24,36,48,60};
        //update
        arr[3]=38; 
        System.out.println(arr[3]);

        //length
        System.out.println(arr.length);
        //sort
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //search
        int index = Arrays.binarySearch(arr, 60);
        System.out.println(index);
        //copy
        int[] copy= Arrays.copyOf(arr, arr.length);
         for(int i=0; i<arr.length;i++){
            System.out.println(copy[i]);
        }

        //print nicely
        System.out.println(Arrays.toString(arr));
    }
}
