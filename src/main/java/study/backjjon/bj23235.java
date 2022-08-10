package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj23235
 * author         : 김재성
 * date           : 2022-08-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-10        김재성       최초 생성
 */
public class bj23235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int count = 1;
        while(true){
            String s = br.readLine();

            if("0".equals(s)){
                break;
            }
            sb.append("Case ").append(count).append(": Sorting... done!").append("\n");
            count++;
        }
        System.out.print(sb);
    }
}
