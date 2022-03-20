package study.algorithm.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 합이같은부분집합 {

    int L = 0;
    int arr[];
    int sum = 0;
    int total;
    String ans = "NO";
    boolean flag;

    public void run(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        arr = new int[num];

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(0, 0);
    }

    //1,3,5,6,7,10
    void DFS(int L, int sum){
        if (flag) return;
        if (L == arr.length){
            if (sum == total/2) {
                ans = "YES";
                flag = true;
            }
        }
        else
        {
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);
        }
    }

}
