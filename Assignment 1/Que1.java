import java.util.*;
class Que1{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
       
        System.out.println("Enter the marks : ");
         int x = in.nextInt();
        if(x>90 && x<=100){
            System.out.println("A+ Grade " +x);
        }
        else if (x>=80 && x<=90){
            System.out.println("A Grade " +x);
        }
        else if(x>70 && x<=80){
            System.out.println("B+ Grade " +x);
        }
        else if(x>60 && x<=70){
             System.out.println("B Grade " +x);
        }
        else if(x>=50 && x<=60){
             System.out.println("c+ Grade " +x);
        }
        else{
             System.out.println("Invalid " +x);
        }
    }
}