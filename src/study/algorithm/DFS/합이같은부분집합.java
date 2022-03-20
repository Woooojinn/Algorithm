package study.algorithm.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 합이같은부분집합 {

<<<<<<< HEAD
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
=======
    int len;
    int arr[];
    int total;
    String ans = "NO";

    public void run(){
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();

        arr = new int[len];

        for (int i=0;i<len;i++){
>>>>>>> 22a5f7ba6c3a2a43bec9148b43d10cff36973913
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(0, 0);
<<<<<<< HEAD
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
=======

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
>>>>>>> 22a5f7ba6c3a2a43bec9148b43d10cff36973913
        }
    }

}
