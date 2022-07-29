package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj21335
 * author         : 김재성
 * date           : 2022-07-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-29        김재성       최초 생성
 */
public class bj21335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long area = Long.valueOf(br.readLine());
        double perimeter = (double) Math.round(Math.sqrt(area * Math.PI) * 2 * 1000000000) / 1000000000;
        System.out.println(perimeter);
    }
}
