package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj23375
 * author         : 김재성
 * date           : 2022-08-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-10        김재성       최초 생성
 */
public class bj23375 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(br.readLine());

        System.out.println((x-r) + " "+ (y+r));
        System.out.println((x+r) + " "+ (y+r));
        System.out.println((x+r) + " "+ (y-r));
        System.out.println((x-r) + " "+ (y-r));

    }
}
