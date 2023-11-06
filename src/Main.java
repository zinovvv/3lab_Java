import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input the first number");
        float firstNum = scan.nextFloat();
        System.out.println("input the second number");
        float secondNum = scan.nextFloat();
        float subtraction = firstNum - secondNum;
        float sum = firstNum + secondNum;
        float multiplication = firstNum * secondNum;
        float division = firstNum / secondNum;
        System.out.println("subtraction: " + (firstNum+secondNum));
        System.out.println("sum: " + sum);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);
    }
}