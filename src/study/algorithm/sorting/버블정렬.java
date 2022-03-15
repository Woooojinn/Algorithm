package study.algorithm.sorting;

import java.util.Scanner;

public class 버블정렬 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int arr[] = new int[len];

        for (int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }

        for(int a:solution(arr)) System.out.print(a+ " ");
    }

    public int[] solution(int arr[]){
        int len = arr.length;

        for(int i=0;i<len-1;i++){
            for (int j=0;j<len-i-1;j++){
                if (arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }
}
