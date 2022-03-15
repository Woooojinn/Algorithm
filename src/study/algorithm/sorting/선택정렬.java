package study.algorithm.sorting;

import java.util.Scanner;

public class 선택정렬 {
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
        for (int i=0;i<arr.length;i++){
            // 최소값을 가지는 배열의 인덱스 번호:idx
            int idx = i;

            //i+1부터 순차적으로 최소값 탐색
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[idx]) idx = j;
            }

            //최소값과 arr[i]을 swap
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i]  = tmp;
        }

        return arr;
    }
}
