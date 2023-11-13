package Array;

import java.util.Scanner;

public class OddPosition {

    public static void main(String [] args) {

        int arr[] ={2,3,4,5,66,45,3,5,323,5,6,3};

        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==1){
            System.out.println(arr[i]);
        }
    }

}}
