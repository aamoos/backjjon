package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    N×M 크기의 벽에 2×1, 1×2 크기의 타일을 채우려고 한다. 겹치지 않게 놓는다면, 최대 몇 개를 채울 수 있을까?
 */
public class bj15700 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());

        System.out.println((a*b)/2);
    }
}
