package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj18408
 * author         : 김재성
 * date           : 2022-07-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-29        김재성       최초 생성
 */
public class bj18408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int count1 = 0;
        int count2 = 0;

        if(a == 1){
            count1++;
        } else{
            count2++;
        }

        if(b == 1){
            count1++;
        } else{
            count2++;
        }

        if(c == 1){
            count1++;
        } else{
            count2++;
        }

        if(count1 > count2){
            System.out.println(1);
        } else{
            System.out.println(2);
        }
    }
}
