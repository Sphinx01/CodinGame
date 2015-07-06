
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        in.nextLine();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        
		String tabString [] = new String [H];
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            tabString[i] =ROW;
        }
        
        String abc [][] = new String [27][H];
		String tabString2 [] = new String [H];
		tabString2  = tabString;
		
		for (int j = 0; j < 26; j++) {
			for (int i = 0; i < H; i++) {
				abc [j][i] = tabString2[i].substring(0, L);
				tabString2[i] = tabString2[i].substring(L);
			}
			
		}
		for(int i = 0; i < H; i++ ){
			abc [26][i] = tabString2[i];
		}
		
		char [] text = T.toCharArray();
		int o;
		String resultat = "";
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < text.length; j++) {
				o =  order(text[j]);
				if(o != -1)
					resultat += abc[o-1][i];
				else 
					resultat += abc[26][i];
			}
			resultat += '\n';
		}
		System.out.println(resultat);
    }

    public static int order(char c){
		int o = ' ';
		switch(c){
			case 'a' :
				o = 1;
				break;
			case 'A' :
				o = 1;
				break;
			case 'b' :
				o = 2;
				break;
			case 'B' :
				o = 2;
				break;
			case 'c' :
				o = 3;
				break;
			case 'C' :
				o = 3;
				break;
			case 'd' :
				o = 4;
				break;
			case 'D' :
				o = 4;
				break;
			case 'e' :
				o = 5;
				break;
			case 'E' :
				o = 5;
				break;
			case 'f' :
				o = 6;
				break;
			case 'F' :
				o = 6;
				break;
			case 'g' :
				o = 7;
				break;
			case 'G' :
				o = 7;
				break;
			case 'h' :
				o = 8;
				break;
			case 'H' :
				o = 8;
				break;
			case 'I' :
				o = 9;
				break;
			case 'i' :
				o = 9;
				break;
			case 'j' :
				o = 10;
				break;
			case 'J' :
				o = 10;
				break;
			case 'k' :
				o = 11;
				break;
			case 'K' :
				o = 11;
				break;
			case 'l' :
				o = 12;
				break;
			case 'L' :
				o = 12;
				break;
			case 'm' :
				o = 13;
				break;
			case 'M' :
				o = 13;
				break;
			case 'n' :
				o = 14;
				break;
			case 'N' :
				o = 14;
				break;
			case 'o' :
				o = 15;
				break;
			case 'O' :
				o = 15;
				break;
			case 'p' :
				o = 16;
				break;
			case 'P' :
				o = 16;
				break;
			case 'Q' :
				o = 17;
				break;
			case 'q' :
				o = 17;
				break;
			case 'r' :
				o = 18;
				break;
			case 'R' :
				o = 18;
				break;
			case 's' :
				o = 19;
				break;
			case 'S' :
				o = 19;
				break;
			case 't' :
				o = 20;
				break;
			case 'T' :
				o = 20;
				break;
			case 'u' :
				o = 21;
				break;
			case 'U' :
				o = 21;
				break;
			case 'v' :
				o = 22;
				break;
			case 'V' :
				o = 22;
				break;
			case 'w' :
				o = 23;
				break;
			case 'W' :
				o = 23;
				break;
			case 'x' :
				o = 24;
				break;
			case 'X' :
				o = 24;
				break;
			case 'y' :
				o = 25;
				break;
			case 'Y' :
				o = 25;
				break;
			case 'z' :
				o = 26;
				break;
			case 'Z' :
				o = 26;
				break;
			default:
				o = -1;
		}
		
	return o;	
	}
}
