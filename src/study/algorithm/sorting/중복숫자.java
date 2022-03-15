package study.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 중복숫자 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(solution(arr));
    }

//    public String solution(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i] == arr[j]) return "D";
//            }
//        }
//
//        return "U";
//    }

    public String solution(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]) return "D";
        }

        return "U";
    }
}
