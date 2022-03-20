package study.algorithm.sorting;

import java.util.Scanner;

public class 삽입정렬 {
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
        for (int i=1;i<arr.length;i++){
            int tmp = arr[i];
            int j;

            for (j=i-1;j>=0;j--){
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }

            arr[j+1] = tmp;
        }

        return arr;
    }
}
