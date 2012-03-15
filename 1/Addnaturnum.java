import java.io.*;

public class Addnaturnum {
    
    public static void main(String[] args) {
        int num,mul3,mul5,i,sum = 0;
        for(i=1;i<1000;i++) {
            mul3 = i%3;
            mul5 = i%5;
            if(mul3 == 0 || mul5 == 0) {
                sum = sum+i;              
            }  
        }
        System.out.println(sum);
    }

}
