
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] Pi = new int [N];
        for (int i = 0; i < N; i++) {
            Pi[i] = in.nextInt();
        }
        Arrays.sort(Pi);
        int min = Pi[1] - Pi[0];
        for(int i = 0; i < N-1; i++){
        	if(Pi[i+1] - Pi[i] < min)
        		min = Pi[i+1] - Pi[i];
        }
        System.out.println(min);
    }

}
