package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj14935
 * author         : 김재성
 * date           : 2022-07-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-29        김재성       최초 생성
 */
public class bj14935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String temp = "";
        while(true){
            a = F(a);
            if(temp.equals(a)){
                System.out.println("FA");
                break;
            }
            temp = a;
        }
        br.close();
    }

    public static String F(String x){
        int length = x.length();
        int result = Integer.parseInt(String.valueOf(x.charAt(0))) * length;
        return String.valueOf(result);
    }
}
