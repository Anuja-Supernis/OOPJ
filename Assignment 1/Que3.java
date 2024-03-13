import java.util.Scanner;
public class Que3{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x : ");
        int x = input.nextInt();
        System.out.println("Enter Operator : ");
        char operator = input.next().charAt(0);
        System.out.println("Enter value of y : ");
        int y = input.nextInt();
       int result;
        switch(operator){
          case '+': 
          result = x + y;
          System.out.println("Result : " + result);
                    break;
          case '-': 
          result = x - y;
          System.out.println("Result : " + result);
                    break;
          case '*':  
          result = x * y;
          System.out.println("Result : " + result);
                    break;         
          case '/':  
          result = x / y;
          System.out.println("Result : " + result);
                    break;          
        }

    }
  }
