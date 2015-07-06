import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int eclairX = in.nextInt();
        int eclairY = in.nextInt();
        int thorX = in.nextInt();
        int thorY = in.nextInt();
        
        while (true) {
            int n = in.nextInt();

            String choix = direction(eclairX, eclairY, thorX, thorY);

            switch(choix){
                case "N":   thorY -= 1;
                break;
                case "S":   thorY += 1;
                break;
                case "NE":   thorY -= 1;
                            thorX +=1 ;
                break;
                case "SE":   thorY += 1;
                            thorX +=1 ;
                break;
                case "NW":   thorY -= 1;
                            thorX -=1 ;
                break;
                case "SW":   thorY += 1;
                            thorX -=1 ;
                break;
                case "E":   thorX +=1 ;
                break;
                case "W":   thorX -=1 ;
                break;
                            
            }

            // Write action to standard output
            System.out.println(choix );
        }
    }
    
    public static String direction(int eclairX, int eclairY,int thorX,int thorY){
        String dir = "";
        int X;
        int Y;
        X = eclairX - thorX;
        Y = eclairY - thorY;
        if(Y>0){
            dir +="S";
        }else if(Y<0){
            dir +="N";
        }
        if(X>0){
            dir +="E";
        }else if(X<0){
            dir +="W";
        }
        
        return dir;
    }
}
