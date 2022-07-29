package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj18409
 * author         : 김재성
 * date           : 2022-07-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-29        김재성       최초 생성
 */
public class bj18409 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int count = 0;
        for(int i=0; i<a; i++){
            String c = String.valueOf(b.charAt(i));
            if("i".equals(c) || "u".equals(c) || "e".equals(c) || "o".equals(c) || "a".equals(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
