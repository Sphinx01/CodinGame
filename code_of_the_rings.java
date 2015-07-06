import java.util.*;
import java.io.*;
import java.math.*;
 
class Player {
	private static char [] charTab = new char[27];
	private static char runeCourante = ' ';
	private static char [] runes = new char[30];
	private static int [] distLeft = new int[30];
	private static int [] distRight = new int[30];
	private static String magicPhrase;
	private static int courant = 0;
	private static int indexL = 30, indexR = 30;
	
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        magicPhrase = in.nextLine();
        String instruction = "";
       
        initAll();
        
        for(int i = 0; i < magicPhrase.length(); i++){
        	computeDist(i);
        	int minL = minDistLeftIndex(), minR = minDistRightIndex();
        	if(minL < minR){
        		if(leftDistanceRunes(courant, indexL) < rightDistanceRunes(courant, indexL)){
        			for(int j = 0; j < leftDistanceRunes(courant, minL) - 1; j++){
        				instruction += '<';
        			}
        		}
        		else{
        			if(leftDistanceRunes(courant, indexL) != 0 && rightDistanceRunes(courant, indexL) != 0){
        			for(int j = 0; j < rightDistanceRunes(courant, indexL) - 1; j++){
        				instruction += '>';
        			}
        			}
        		}
        		
        		runeCourante = runes[indexL];
        		courant = indexL;
        		for(int j = 0; j < leftDistance(runeCourante, magicPhrase.charAt(i)); j++){
        			instruction += '+';
        		}
        		runes[indexL] = magicPhrase.charAt(i);
        		runeCourante = magicPhrase.charAt(i);
        		courant = indexL;
        	}
        	else{
        		if(leftDistanceRunes(courant, indexR) < rightDistanceRunes(courant, indexR)){
        			for(int j = 0; j < leftDistanceRunes(courant, indexR) - 1; j++){
        				instruction += '<';
        			}
        		}
        		else{
        			if(leftDistanceRunes(courant, indexR) != 0 && rightDistanceRunes(courant, indexR) != 0){
        			for(int j = 0; j < rightDistanceRunes(courant, indexR)- 1; j++){
        				instruction += '>';
        			}
        			}
        		}
        		
        		runeCourante = runes[indexR];
        		courant = indexR;
        		for(int j = 0; j < rightDistance(runeCourante, magicPhrase.charAt(i)); j++){
        			instruction += '-';
        		}
        		runes[indexR] = magicPhrase.charAt(i);
        		runeCourante = runes[indexR];
        		courant = indexR;
        	}
        	instruction += '.';
        }
       
        System.out.println(instruction);
        
        
    }
    
    public static void initAll(){
    	charTab[0] = ' ';
        for(int i = 1; i < charTab.length; i++){
        	charTab[i] = (char) (65 + i - 1);
        }
        
        for(int i = 0; i < runes.length; i++){
        	runes[i] = ' ';
        }
    }
    
    public static int charIndex(char c){
    	for(int i = 0; i < charTab.length; i++){
    		if(charTab[i] == c)
    			return i;
    	}
    	return -1;
    }
    
    public static int leftDistance(char c1, char c2){
    	int d = 0;
    	for(int i = charIndex(c2); i >= 0; i--){
    		if(charIndex(c1) == i)
    			return d;
    		
    		d++;
    	}
    	for(int i = 26; i >= 0; i--){
    		if(charIndex(c1) == i)
    			return d;
    		
    		d++;
    	}
    	return d;
    }
    
    public static int rightDistance(char c1, char c2){
    	int d = 0;
    	for(int i = charIndex(c2); i < 27; i++){
    		if(charIndex(c1) == i)
    			return d;
    		
    		d++;
    	}
    	for(int i = 0; i < charIndex(c2); i++){
    		if(charIndex(c1) == i)
    			return d;
    		
    		d++;
    	}
    	return d;
    }

    public static int leftDistanceRunes(int c1, int c2){
    	int d = 0;
    	for(int i = c2; i >= 0; i--){
    		if(c1 == i)
    			return d;
    		
    		d++;
    	}
    	for(int i = 29; i >= 0; i--){
    		if(c1 == i)
    			return d;
    		
    		d++;
    	}
    	return d;
    }
    
    public static int rightDistanceRunes(int c1, int c2){
    	int d = 0;
    	for(int i = c2; i < 30; i++){
    		if(c1 == i)
    			return d;
    		
    		d++;
    	}
    	for(int i = 0; i < c2; i++){
    		if(c1 == i)
    			return d;
    		
    		d++;
    	}
    	return d;
    }
  
    public static void computeDist(int k){
    	for(int i = 0; i < distLeft.length; i++){
    		distLeft[i] = leftDistance(runes[i], magicPhrase.charAt(k)) + 
    				(leftDistanceRunes(courant, i) <  rightDistanceRunes(courant, i)
    						?leftDistanceRunes(courant, i):rightDistanceRunes(courant, i));
    		distRight[i] = rightDistance(runes[i], magicPhrase.charAt(k)) + 
    				(leftDistanceRunes(courant, i) <  rightDistanceRunes(courant, i)
    						?leftDistanceRunes(courant, i):rightDistanceRunes(courant, i));
    	}
    }
    public static int minDistLeftIndex(){
    	int min = 31;
    	for(int i = 0; i < distLeft.length; i++){
    		if(min > distLeft[i]){
    			min = distLeft[i];
    			indexL = i;
    		}
    	}
    	return min;
    }
    
    public static int minDistRightIndex(){
    	int min = 31;
    	for(int i = 0; i < distRight.length; i++){
    		if(min > distRight[i]){
    			min = distRight[i];
    			indexR = i;
    		}
    	}
    	return min;
    }
}
