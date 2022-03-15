package study.algorithm.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 합이같은부분집합 {

    int len;
    int arr[];
    int total;
    String ans = "NO";

    public void run(){
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();

        arr = new int[len];

        for (int i=0;i<len;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(0, 0);

        System.out.println(ans);
    }

    //1,3,5,6,7,10
    void DFS(int level, int sum){
        if (level == len){
            if (sum == (total-sum)) {
                ans = "YES";
            }
            return;
        }
        else {
         DFS(level + 1, sum + arr[level]);
         DFS(level + 1, sum);
        }
    }

}
