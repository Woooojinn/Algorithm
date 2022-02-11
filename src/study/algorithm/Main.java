package study.algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();

        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(T.solution8_2(str));
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

    //8.1 유효한 팰린드룸
    public String solution8_1(String str){
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
    }

    //8.2 유효한 팰린드룸(ReplaceAll + 정규식 사용)
    public String solution8_2(String str){
        str = str.toUpperCase();
        str = str.replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();

        if (tmp.equals(str)) return "YES";
        else return "NO";
    }
}
