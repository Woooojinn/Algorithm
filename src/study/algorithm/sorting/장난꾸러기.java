package study.algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 장난꾸러기 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int tmp[] = arr.clone();

        Arrays.sort(tmp);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp[i]) {
                list.add(i + 1);
            }
        }

        list.sort(Comparator.naturalOrder());
        return list;
    }

}
