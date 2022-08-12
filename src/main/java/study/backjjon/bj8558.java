package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj8558
 * author         : 김재성
 * date           : 2022-08-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-12        김재성       최초 생성
 */
public class bj8558 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        for(int i=1; i<=n; i++){
            result *=i;
            result %= 10;
        }
        System.out.println(result);
    }
}
