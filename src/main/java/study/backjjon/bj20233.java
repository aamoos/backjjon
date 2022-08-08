package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj20233
 * author         : 김재성
 * date           : 2022-08-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-08        김재성       최초 생성
 */
public class bj20233 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int firstOptionFee = a + ((T>30 ? T : 30) - 30) * x * 21;
        int secondOptionFee = b + ((T>45 ? T : 45) - 45 ) * y * 21;

        System.out.print(firstOptionFee + " " + secondOptionFee);
    }
}
