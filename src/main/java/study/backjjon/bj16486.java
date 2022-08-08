package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj16486
 * author         : 김재성
 * date           : 2022-08-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-08        김재성       최초 생성
 */
public class bj16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d1 = Double.parseDouble(br.readLine());
        double d2 = Double.parseDouble(br.readLine());

        double result = (2 * d1) + (2 * d2 * Math.floor(Math.PI*1000000)/1000000.0);
        System.out.println(result);
    }
}
