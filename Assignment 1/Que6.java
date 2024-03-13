import java.util.*;

public class Que6{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight : ");
        float weight = in.nextFloat();
        System.out.println("Enter height : ");
        float height = in.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("BMI is :" + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normalweight");
        }
        else if(bmi >= 25.0 && bmi <= 29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Invalid");
        }
        
    }
}