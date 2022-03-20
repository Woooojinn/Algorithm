package study.algorithm;

import study.algorithm.BFS.*;
import study.algorithm.DFS.경로탐색;
import study.algorithm.DFS.경로탐색인접리스트;
import study.algorithm.DFS.바둑이승차;
import study.algorithm.DFS.합이같은부분집합;
import study.algorithm.queue.응급실;
import study.algorithm.sorting.*;
import study.algorithm.stack.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();

        Scanner in=new Scanner(System.in);

        //2.1
        //1) 내 코드
        /*
        int cnt = in.nextInt();

        int arr[] = new int[cnt];

        for (int i=0;i<cnt;i++){
            arr[i] = Integer.valueOf(in.next());
        }

        System.out.println(T.solution2_1(arr));
        */
        //2) 정답
        /*
        int cnt = in.nextInt();

        int arr[] = new int[cnt];

        for (int i=0;i<cnt;i++){
            arr[i] = in.nextInt();
        }

        for (int x: T.solution2_1(arr)){
            System.out.print(x + " ");
        }
        */

        //2.2
        /*
        int cnt = in.nextInt();

        int arr[] = new int[cnt];

        for (int i=0;i<cnt;i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution2_2(arr));
        */

        //2.3
        //1) 내 코드
        /*
        int num = in.nextInt();

        int a[] = new int[num];
        int b[] = new int[num];

        for(int i=0;i<num;i++){
            a[i] = in.nextInt();
        }

        for(int i=0;i<num;i++){
            b[i] = in.nextInt();
        }

        for (String result:T.solution2_3(a, b)){
            System.out.println(result);
        }

         */

        //2) 정답
        /*
        int num = in.nextInt();

        int a[] = new int[num];
        int b[] = new int[num];

        for(int i=0;i<num;i++){
            a[i] = in.nextInt();
        }

        for(int i=0;i<num;i++){
            b[i] = in.nextInt();
        }

        for (char c:T.solution2_3(a, b).toCharArray()){
            System.out.println(c);
        }

         */

        //2.4
        //1) 내 코드
        /*
        int cnt = in.nextInt();

        for (int x: T.solution2_4(cnt)){
            System.out.print(x + " ");
        }
         */
        //2) 정답

        //2.5
        //System.out.println(T.solution2_5(in.nextInt()));

        //2.6
        //1) 내 코드
        /*
        int cnt = in.nextInt();

        int arr[] = new int[cnt];

        for (int i=0;i<cnt;i++){
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution2_6_1(arr));
         */
        //2) 정답
        /*
        int cnt = in.nextInt();
        int arr[] = new int[cnt];

        for (int i =0;i<cnt;i++){
            arr[i] = in.nextInt();
        }


        for (int x: T.solution2_6_2(cnt, arr)){
            System.out.print(x + " ");
        }
         */

        //5.1 올바른 괄호
//        올바른괄호 c = new 올바른괄호();
//        c.run();

        //5.2 괄호 문자 제거
//        괄호문자제거 c = new 괄호문자제거();
//        c.run();

        //5.3 크레인 인형뽑기
//        크레인인형뽑기 c = new 크레인인형뽑기();
//        c.run();

        //5.4 후위식 연산
//        후위식연산 c = new 후위식연산();
//        c.run();

        //5.5 쇠막대기
//        쇠막대기 c = new 쇠막대기();
//        c.run();

        //5.6 응급실
        응급실 c = new 응급실();
        c.run();

        //6.1 선택정렬
//        선택정렬 c = new 선택정렬();
//        c.run();

        //6.2 버블정렬
//        버블정렬 c = new 버블정렬();
//        c.run();

        //6.3 삽입정렬
//        삽입정렬 c = new 삽입정렬();
//        c.run();

        //6.4 LRU
//        LRU c = new LRU();
//        c.run();

        //6.5 중복숫자
//        중복숫자 c = new 중복숫자();
//        c.run();

        //6.6 장난꾸러기
//        장난꾸러기 c = new 장난꾸러기();
//        c.run();

        //6.7 좌표정렬
//        좌표정렬 c = new 좌표정렬();
//        c.run();

        //6.8 이분검색
//        이분검색 c = new 이분검색();
//        c.run();

        //6.9 뮤직비디오
//        뮤직비디오_결정알고리즘 c = new 뮤직비디오_결정알고리즘();
//        c.run();

        //6.10 마구간 정하기
//        마구간정하기_결정알고리즘 c = new 마구간정하기_결정알고리즘();
//        c.run();

        //7.4 재귀함수(피보나치)
//        Recursive recursive = new Recursive();
//        recursive.run(in.nextInt());

        //7.5 이진트리순회(DFS)
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.run();

        //7.6 부분집합 구하기(DFS)
//        Subset subset = new Subset();
//        subset.run(in.nextInt());

//        //7.7 이진트리탐색(BFS)
//        BinaryTreeBFS binaryTreeBFS = new BinaryTreeBFS();
//        binaryTreeBFS.run();

        //7.8 송아지 찾기
//        CalfFinder calfFinder = new CalfFinder();
//        calfFinder.run(in.nextInt(), in.nextInt());

        //7.10 말단 노드까지 최단 거리
//        말단노드까지최단거리 c = new 말단노드까지최단거리();
//        c.run();

        //7.12 경로탐색(DFS)
//        경로탐색 c = new 경로탐색();
//        c.run();

        //7.13 경로탐색(DFS, 인접리스트)
//        경로탐색인접리스트 c = new 경로탐색인접리스트();
//        c.run();

        //7.14 최단거리(BFS)
//        그래프최단거리 c = new 그래프최단거리();
//        c.run();

        //8.1 합이 같은 부분 집합
<<<<<<< HEAD
        합이같은부분집합 c = new 합이같은부분집합();
        c.run();
=======
//        합이같은부분집합 c = new 합이같은부분집합();
//        c.run();

        //8.2 바둑이 승차
//        바둑이승차 c = new 바둑이승차();
//        c.run();

        //8.11 미로의 최단거리 통로
//        미로의최단거리통로 c = new 미로의최단거리통로();
//        c.run();
>>>>>>> 22a5f7ba6c3a2a43bec9148b43d10cff36973913
    }

    //7. 회문 문자열
    public String solution7(String str){
        //1) StringBuilder의 reverse() 사용
        /*
        StringBuilder sb = new StringBuilder(str);

        if (sb.reverse().toString().equalsIgnoreCase(str)) return "YES";
        else return "NO";
         */

        //2) 문자열 길이 절반만큼 비교하기
        str = str.toUpperCase();

        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)) return "NO";
        }

        return "YES";
    }

    //8. 유효한 팰린드룸
    public String solution8(String str){
        //1) 내 코드
        /*
        str = str.toUpperCase();

        int lt =0;
        int rt = str.length()-1;

        while(lt<rt){
            if (!Character.isAlphabetic(str.charAt(lt))) lt++;
            else if (!Character.isAlphabetic(str.charAt(rt))) rt--;
            else
            {
                if(str.charAt(lt) != str.charAt(rt)) return "NO";

                lt++;
                rt--;
            }
        }

        return "YES";
         */

        //2) (ReplaceAll + 정규식 사용)
        str = str.toUpperCase();
        str = str.replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();

        if (tmp.equals(str)) return "YES";
        else return "NO";
    }

    //9. 숫자만 추출
    public int solution9(String str){
        //1) 내 코드(replaceAll 사용)
        /*
        str = str.replaceAll("[^0-9]","");

        int i = 0;

        for (;i<str.length();i++){
            if (str.charAt(i) != '0') break;
        }

        return str.substring(i);
        */

        //2) 아스키 코드 사용
        /*
        int ans = 0;

        char arr[] = str.toCharArray();

        for(int i=0 ; i < arr.length ; i++){
            if (arr[i] >= 48 && arr[i]<= 57) //0~9
                ans = ans * 10 + (arr[i] -  48);
        }

        return String.valueOf(ans);
        */

        //3) ParseInt 사용
        String ans  = "";

        for (char x : str.toCharArray()){
            if (Character.isDigit(x)) ans += x;
        }

        return Integer.parseInt(ans);
    }

    //10. 가장 짧은 문자 거리
    public int[] solution10(String str, String target){
        int result[] = new int[str.length()];

        int pos = 101;

        //우방향으로 1차 검사
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == target.charAt(0)) {
                pos = 0;
                result[i] = pos;
            }
            else{
                pos ++;
                result[i] = pos;
            }
        }

        pos = 101;

        //좌방향으로 2차 검사
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i) == target.charAt(0)) {
                pos = 0;
            }
            else{
                pos ++;

                result[i] = Math.min(result[i], pos);
            }
        }

        return result;
    }

    //11. 문자열 압축
    public String solution11(String str){
            //KKTFFFFFFEEE
            //K2TF6E

        //내 코드(
        /*
            char arr[] = str.toCharArray();

            String ans = "";

            int cnt = 1;

            ans += arr[0];

            for(int i=1;i<arr.length;i++){
                if (arr[i] != arr[i-1]){
                    if (cnt > 1){
                        ans += cnt;
                        cnt = 1;
                    }

                    ans += arr[i];
                }
                else
                {
                    cnt++;
                }
            }

            if (cnt>1) ans += cnt;

            return ans;

         */

        //정답 코드
        String ans = "";

        str = str + " ";

        int cnt = 1;

        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                ans += str.charAt(i);
                if (cnt > 1) ans += cnt;
                cnt = 1;
            }
        }

        return ans;
    }

    //12. 암호
    public String solution12(int cnt, String str){
        //1) 내 코드
        /*
        String ans = "";

        int s = 0;

        for (int i=0;i<str.length();i++){

            int tmp = str.charAt(i) == '#' ? 1:0;

            if (tmp == 1){
                s += Math.pow(2,6 - (i%7));
            }

            if (i!=0 && (i+1)%7 == 0)
            {
                ans += (char)s;
                s = 0;
            }
        }

        return ans;
        */

        //2) substring, replace 사용
        String ans = "";

        for (int i=0;i<cnt;i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');

            int num = Integer.parseInt(tmp, 2);

            ans += (char) num;

            str = str.substring(7);
        }

        return ans;
    }

    //2.1 큰 수 출력하기
    public ArrayList<Integer> solution2_1(int[] arr){
        //1) 내 코드
        /*
        String ans = "";
        ans += arr[0] + " ";

        for (int i=1;i<arr.length;i++){
            if (arr[i] > arr[i-1]) ans += (arr[i] + " ");
        }

        return ans;
         */

        //2) 정답
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i=1; i<arr.length;i++){
            if (arr[i]>arr[i-1]) list.add(arr[i]);
        }

        return list;
    }

    //2.2 보이는 학생
    public int solution2_2(int[] arr){
        //1) 내 코드
        int max = arr[0];
        int cnt = 1;

        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                cnt ++;
                max = arr[i];
            }
        }

        return cnt;

        //2) 정답(동일)
    }

    //2.3 가위 바위 보
    public String solution2_3(int a[], int b[]){
        //1) 내 코드
/*
        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            //1
            if (a[i] == 1){
                if (b[i] == 1) list.add("D");
                else if (b[i] == 2) list.add("B"); // 1 2
                else list.add("A"); // 1 3
            }
            //2
            else if (a[i] == 2){
                if (b[i] == 1) list.add("A"); // 2 1
                else if (b[i] == 2) list.add("D");
                else list.add("B"); // 2 3
            }
            //3
            else{
                if (b[i] == 1) list.add("B"); // 3 1
                else if (b[i] == 2) list.add("A"); // 3 2
                else list.add("D");
            }
        }

        return list;


*/
        //2) 정답(A가 비기고, 이기고, 지는 기준만 정하기)

        String ans = "";

        for (int i =0;i<a.length;i++){
            if (a[i] == b[i]) ans += "D";
            else if (a[i] == 1 && b[i] == 3) ans += "A";
            else if (a[i] == 2 && b[i] == 1) ans += "A";
            else if (a[i] == 3 && b[i] == 2) ans += "A";
            else ans += "B";
        }

        return ans;

    }

    //2.4 피보나치 수열
    public int[] solution2_4(int cnt){
        //내 코드, 정답 동일
        int[] arr= new int[cnt];

        arr[0] = 1;
        arr[1] = 1;

        for (int i=2;i<cnt;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }

    //2.5 소수(에라토스테네스 체)
    public int solution2_5(int num){
        //1) 내 코드
        /*
        int ans = 4; //2,3,5,7

        for (int i=10;i<=num;i++){
            if(((i%2) != 0)
                    && ((i%3) != 0)
                    && ((i%5) != 0)
                    && ((i%7) != 0)){
                System.out.println(i);
                ans ++;
            }
        }

        return ans;

*/
        //2) 정답(에라토스테네스 체 방법)
        int cnt = 0;

        int ans[] = new int[num+1];

        for(int i=2;i<=num;i++){
            if(ans[i] == 0){
                cnt++;

                //배수 다 체크
                for(int j = i;j<=num;j=j+i) ans[j]=1;
            }
        }

        return cnt;
    }

    //2.6 뒤집은 소수(내 코드)
    public String solution2_6_1(int[] arr){
        String ans = "";

        for(int i=0;i<arr.length;i++){
            //뒤집힌 수 구하기
            String rev ="";

            int tmp = arr[i];

            for(int j=0;j<Math.log10(arr[i]);j++){
                rev += tmp%10;
                tmp = tmp/10;
            }

            int num = Integer.parseInt(rev);

            int k =0;

            for (k=2;k<num;k++){
                if (num%k == 0){
                    break;
                }
            }

            if (k == num) ans += num +" ";
        }

        return ans;
    }

    //2.6 뒤집은 소수(정답)
    public ArrayList<Integer> solution2_6_2(int cnt, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        //뒤집은 숫자 구하기
        //1321
        for (int i=0;i<cnt;i++){
            int tmp = arr[i];
            int target = 0;
            int t = 0;

            while(tmp>0){
                t = tmp%10;
                target = target * 10 + t;
                tmp = tmp/10;
            }

            //소수 체크
            if (isPrime(target)) list.add(target);
        }

        return list;
    }

    public boolean isPrime(int num){
        if (num == 1) return false;

        for (int i=2;i<num;i++){
            if (num%i == 0) return false;
        }

        return true;
    }

}
