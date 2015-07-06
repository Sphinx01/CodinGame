import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] Pi = new int [N];
        for (int i = 0; i < N; i++) {
            Pi[i] = in.nextInt();
        }
        int help;
        int min = (Pi[1] - Pi[0]>0)?Pi[1] - Pi[0]:Pi[0] - Pi[1];
        for(int i = 0; i < N - 1; i++){
        	for(int j = i + 1; j < N; j++){
        		help = (Pi[i] - Pi[j]>0)?Pi[i] - Pi[j]:Pi[j] - Pi[i];
        		if(help<min)
        		    min = help;
        	}
        }
        
        System.out.println(min);
    }

}
