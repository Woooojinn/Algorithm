package study.algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();

        Scanner in=new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution7_1(str));
    }

    //7.1 회문 문자열(StringBuilder의 reverse() 사용)
    public String solution7_1(String str){

        //String tmp = str.toUpperCase();

        StringBuilder sb = new StringBuilder(str);

        if (sb.reverse().toString().equalsIgnoreCase(str)) return "YES";
        else return "NO";
    }

    //7.2 회문 문자열(문자열 길이 절반만큼 비교하기)
    public String solution7_2(String str){
        str = str.toUpperCase();

        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)) return "NO";
        }

        return "YES";
    }
}
