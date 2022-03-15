package study.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    //이분 검색은 정렬된 상태가 기본 조건
    public void run(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(num, arr));
    }

    public int solution(int num, int arr[]){
        int lt = 0, rt = arr.length - 1;
        int mid;
        int ans = 0;

        //정렬 먼저
        Arrays.sort(arr);

        while(rt <= rt){
            mid = (lt+rt)/2;

            if (arr[mid] == num) {
                ans = mid + 1;
                break;
            }
            if (arr[mid] > num){
                rt = mid - 1;
            }
            if (arr[mid] < num){
                lt = mid + 1;
            }
        }

        return ans;
    }
}
