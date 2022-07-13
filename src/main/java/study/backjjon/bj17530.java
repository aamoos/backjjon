package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj17530 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int carlos = arr[0];
        boolean sw = false;
        for(int i=1; i<n; i++){
            if(arr[i]>carlos){
                sw=true;
            }
        }
        System.out.println(!sw?"S":"N");
    }
}
