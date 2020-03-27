import java.util.Scanner;
//You have to consider here 1kilometer per hour=1.609 miles per hour
public class speedconveter {
    public static void main(String[] args) {
    Scanner speed=new Scanner(System.in);
        System.out.println("Enter a speed value:-");

    double userspeedkilometerperhour=speed.nextDouble();
        if(userspeedkilometerperhour<0){
            System.out.println("This is invalid input");
        }
        else if (userspeedkilometerperhour>0){
            double milesperhour=userspeedkilometerperhour*1.609;
            System.out.println("Userspeed kilometer per hour in Mile per hour is :- "+milesperhour);
        }

    }
}
