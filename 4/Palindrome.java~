import java.io.*;
import java.lang.*;

class  Palindrome {

    public static void main(String[] args) {

    boolean flag = false;
    Reverse rev = new Reverse();
        for(int firstNumber=999;firstNumber>=1;firstNumber--){
            for(int secondNumber=firstNumber-1;secondNumber>=1;secondNumber--){
                int multiple = firstNumber*secondNumber;
                sop("1st num --- "+firstNumber+"* 2nd num -- "+secondNumber+"  == "+multiple);
                int reverseNumber = rev.reverse(multiple);
                sop("Reverse --- "+reverseNumber);
                if(reverseNumber==multiple){
                    sop("Largest palindrome number :: "+reverseNumber);
                    flag=true;
                    break;
                }              
            }
            if(flag==true){
                break;
            }
        }  
   }
   
   static void sop(String strng){
    System.out.println(strng);
   }
    
}


class Reverse{

  public int reverse(int multiple){
        int reminder=0,reverseNumber=0;
        while(multiple>0){
            reminder=multiple%10;
            multiple=multiple/10;
            reverseNumber=reverseNumber*10+reminder;
        }
        return reverseNumber;
    }
}
