package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj25191
 * author         : 김재성
 * date           : 2022-08-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-10        김재성       최초 생성
 */
public class bj25191 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int chicken = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cola = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        System.out.println(Math.min((cola/2 + beer), chicken));
    }
}
