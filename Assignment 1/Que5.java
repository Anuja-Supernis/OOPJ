import java.util.*;

public class Que5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char x = in.next().charAt(0);
        if(x == 'a' || x == 'e' || x=='i' || x=='o' || x=='u' ){
           System.out.println("It is a Vowel."); 
        }
        else{
            System.out.println("It is a Consonant. ");
        }


    }
}