import java.io.*;
import java.lang.*;

class Lprimefac {

    public static void main(String[] args) {
        int compn,i,pfact=0,flag,j,k;
        InputStreamReader reader = new InputStreamReader (System.in);
        BufferedReader buf_reader = new BufferedReader (reader);
        System.out.println("Enter a Composit Number");
        try {
            String s = buf_reader.readLine ();
            compn = Integer.parseInt (s.trim ()); 
            for(i=2;i<=compn/2;i++) {
               if(compn%i == 0) {
                    for (j=1;j<=compn/2;j++) {
                        flag = 0;
                        for (k=1;k<=j;k++) {
                            if (j/k == (float) j/k) {
                                flag++;
                            }    
                        }
                    
                        if (flag == 2) {
                            if(compn %j == 0) {
                                pfact = j;
                            }
                        }
                    }
               } 
                
            }
            if(pfact !=0) {
                System.out.println("largst prime facztor is" +pfact);
            } else {
                System.out.println("please enter Composit number");   
            
            }
        }catch (IOException ioe) {
         System.out.println ("IO exception = " + ioe);
       }    
    
     }

}
