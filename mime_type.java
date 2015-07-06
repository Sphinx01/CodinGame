import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();
        String EXT [] = new String[N];
        String MT[] = new String[N];
        String FNAME[] = new String[Q];
        
        for (int i = 0; i < N; i++) {
            EXT[i] = in.next(); // file extension
            MT[i] = in.next(); // MIME type.
            in.nextLine();
        }
        for (int i = 0; i < Q; i++) {
            FNAME[i] = in.nextLine(); // One file name per line.
        } 
        
        for (int i = 0; i < Q; i++) {
            boolean yes = false;
            int k, m = 1;
            if(FNAME[i].contains(".")){
            for(k = FNAME[i].indexOf(".")-1; k < FNAME[i].length()-1; k++){
            	if(FNAME[i].substring(FNAME[i].indexOf(".")+k) == "." && FNAME[i].substring(FNAME[i].indexOf(".")+k+1) == ".")
            		m++;
            }}
        	for (int j = 0; j < N; j++) {
        		if(FNAME[i].contains(".")){
        		
        		System.out.println(m);
        		System.out.println(FNAME[i].substring(FNAME[i].indexOf(".")+m));
            	if(egal(FNAME[i].substring(FNAME[i].indexOf(".")+m), EXT[j])){
            	    if(FNAME[i].substring(0, FNAME[i].length() - FNAME[i].indexOf(".")-m) != "")
            		System.out.println(MT[j]);
            		yes = true;
            		break;
            	}
        		}
            }  
        	
        	if(!yes)
        		System.out.println("UNKNOWN");
        } 
    }
    
    public static boolean egal(String str1, String str2){
    	
    	if(str1.length() != str2.length())
    		return false;
    	else
    		for(int i = 0; i < str1.length(); i++){
    			String c2 = "" + str2.charAt(i); 
    			if(str1.charAt(i) != c2.toLowerCase().charAt(0) && str1.charAt(i) != c2.toUpperCase().charAt(0))
    				return false;
    		}
    	return true;
    }
 
}
