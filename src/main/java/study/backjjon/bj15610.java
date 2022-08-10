package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj15610
 * author         : 김재성
 * date           : 2022-08-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-10        김재성       최초 생성
 */
public class bj15610 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double a = Double.parseDouble(br.readLine());
        double result = 4 * Math.sqrt(a);
        System.out.println(result);
    }
}
