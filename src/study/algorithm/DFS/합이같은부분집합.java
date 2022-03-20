package study.algorithm.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 합이같은부분집합 {
    int len;
    int input[];
    int ch[];

    ArrayList<Integer> sum;
    ArrayList<ArrayList<Integer>> list;
    ArrayList<Integer> temp = new ArrayList<>();

    public void run(){
        Scanner sc = new Scanner(System.in);
         len = sc.nextInt();

         input = new int[len];

        for (int i=0;i<len;i++){
            input[i] = sc.nextInt();
        }

        ch = new int[len];
        sum = new ArrayList<>();
        list = new ArrayList<>();

        DFS(0);

        for(int a: temp){
            System.out.println(a + " ");
        }
    }

    //1,3,5,6,7,10
    //index:0
    void DFS(int index){
        if (index == len -1) {
            if (ch[index] == 1) temp.add(input[index]);
            return;
        }
        else
        {
            ch[index] = 1;
            temp.add(input[index]);
            DFS(index+1);
            temp.clear();
            ch[index] = 0;
            DFS(index+1);
        }
    }

}
