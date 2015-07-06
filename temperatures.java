
import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); 
        in.nextLine();
        String TEMPS = in.nextLine(); 
        
        
        if(N == 0)
            System.out.println("0"); 
        else if(N == 1)
            System.out.println(TEMPS); 
        else{
        	int n = TEMPS.length(), k;
        	int tab [] = new int [N];
            String str = TEMPS;
            
        	for(int i = 0; i < N-1; i++){
        		k = str.indexOf(" ");
        		tab[i] = Integer.valueOf(str.substring(0, k));
        		str = str.substring(k+1);
            }
        	tab[N-1] = Integer.valueOf(str);
        	
        	nearestToZero(tab);
            
        }
        
    }
    public static void nearestToZero( int tab[]){
    	int n = tab.length;
    	//int result = 0;
    	
    	
    		for(int j = 1; j < n; j++){
    			if(Math.abs(tab[0]) > Math.abs(tab[j]))
    				tab[0] = tab[j];
    			if(Math.abs(tab[0]) == Math.abs(tab[j])){
    				if(String.valueOf(tab[0]).contains("-"))
    					tab[0] = tab[j];
    			}
    		}
    	
    	System.out.println(tab[0]);
    }
}
