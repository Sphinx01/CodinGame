import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		

        // game loop
        while (true) {
            String enemy1 = in.next();
            int dist1 = in.nextInt();
            String enemy2 = in.next();
            int dist2 = in.nextInt();
            
            if(enemy2 != null) {
            	if(dist1 <= dist2)
            		System.out.println(enemy1);
            	else 
            		System.out.println(enemy2);
            }else{
            	System.out.println(enemy1);
            }
            
        }
    }
}
