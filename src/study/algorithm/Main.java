package study.algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();

        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();
        String str = in.next();

        System.out.println(T.solution12(cnt, str));
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
}
