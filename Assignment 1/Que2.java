import java.util.*;
class Que2{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int x = in.nextInt();
        if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)){
            System.out.println("This  is a Leap Year");
        }
        else{
             System.out.println("This  is not Leap Year");
        }


        switch ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)){
             System.out.println("Enter Year : ");
            case 1:
                 System.out.println("This  is a Leap Year");
    }
}
