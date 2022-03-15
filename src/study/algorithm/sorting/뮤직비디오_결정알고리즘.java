package study.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오_결정알고리즘 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //노래 수
        int m = sc.nextInt(); //dvd 장 수

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    public int solution(int n, int m, int arr[]){
        int ans = 0;

        int lt = Arrays.stream(arr).max().getAsInt(); //lt를 배열의 최대값으로 설정
        int rt = Arrays.stream(arr).sum(); //배열 각 원소 총합을 rt로 설정

        while(lt<=rt){
            int mid = (lt+rt)/2;

            if (count(arr, mid) <= m){
                ans = mid;
                rt = mid - 1;
            }
            else{
                lt = mid + 1;
            }
        }

        return ans;
    }

    public int count(int arr[],int capacity){
        int sum = 0;
        int cnt = 1;

        for (int x:arr){
            if (sum + x >capacity){
                cnt++;
                sum = x;
            }
            else {
                sum += x;
            }
        }

        return cnt;
    }
}
