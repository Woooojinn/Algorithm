package study.algorithm.sorting;

import java.util.Scanner;

public class LRU {
    int size;
    int len;

    public void run(){
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        len = sc.nextInt();

        int arr[] = new int[len]; //작업
        int cache[] = new int[size]; //캐시

        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        for (int x : solution(cache, arr)) System.out.print(x + " ");
    }

    public int[] solution(int cache[], int arr[]){
        int j;

        for (int i=0;i<arr.length;i++){
            for (j=0;j<cache.length;j++){
                if (cache[j] == arr[i]){
                    //Cache Hit
                    for (int a=j;a>0;a--){
                        cache[a] = cache[a-1];
                    }

                    cache[0] = arr[i];

                    break;
                }
            }

            if (j == cache.length){
                //Cache Miss
                for (int a=cache.length-1;a>0;a--){
                    cache[a] = cache[a-1]; // 한칸씩 뒤로 밀기
                }

                cache[0] = arr[i];
            }
        }

        return cache;
    }

}
