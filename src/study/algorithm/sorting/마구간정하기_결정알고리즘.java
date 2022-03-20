package study.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기_결정알고리즘 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //마굿간 수
        int m = sc.nextInt(); //말 수

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    public int solution(int n, int m, int arr[]) {
        int ans = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= m) {
                //넓혀야 됨
                ans = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return ans;
    }

    public int count(int arr[], int mid){
        int cnt = 1;
        int idx = 0;

        for(int i=1;i<arr.length;i++){
            if (arr[i] - arr[idx] >= mid) {
                cnt++;
                idx = i;
            }
            else{
                continue;
            }
        }

        return cnt;
    }
}
