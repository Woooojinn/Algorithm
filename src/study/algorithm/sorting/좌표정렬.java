package study.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Point[] arr = new Point[size];

        for (int i=0;i<size;i++){
            arr[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        for(Point p : solution(arr)){
            System.out.println(p.x + " " + p.y);
        }
    }

    public Point[] solution(Point[] arr){
        Arrays.sort(arr);

        return arr;
    }

    class Point implements Comparable<Point>{
        int x,y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) return this.y-o.y;
            else return this.x-o.x;
        }
    }
}
