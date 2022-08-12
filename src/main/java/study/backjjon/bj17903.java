package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj17903
 * author         : 김재성
 * date           : 2022-08-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-12        김재성       최초 생성
 */
public class bj17903 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

            }
        }

        if(n>=8){
            System.out.println("satisfactory");
        }else{
            System.out.println("unsatisfactory");
        }
    }
}
